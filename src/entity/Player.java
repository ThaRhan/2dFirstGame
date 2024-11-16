package entity;

import main.GamePanel;
import main.KeyHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Player extends Entity{
    GamePanel gp;
    KeyHandler keyH;
    public int hasRedMinion = 0;
    public int hasBlueMinion = 0;
    public int hasBoot = 0;
    public int destroyedTurretsCounter = 0;

    public final int screenX, screenY;


    public Player(GamePanel gp, KeyHandler keyH){
        this.gp = gp;
        this.keyH = keyH;

        screenX = gp.screenWidth/2 - (gp.tileSize/2);
        screenY = gp.screenHeight/2 - (gp.tileSize/2);

        solidArea = new Rectangle(8, 16, 32, 32);
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        setDefaultValues();
        getPlayerImage();
    }

    public void setDefaultValues(){
        worldX = gp.tileSize * 25;
        worldY = gp.tileSize * 42;
        speed = 4;
        direction = "down";
    }

    public void getPlayerImage(){
        try{
            up1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/up_look1.png")));
            up2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/up_look2.png")));
            down1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/down_look1.png")));
            down2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/down_look2.png")));
            right1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/right_look1.png")));
            right2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/right_look2.png")));
            left1 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/left_look1.png")));
            left2 = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/player/left_look2.png")));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(){
        if(keyH.rightPressed || keyH.downPressed || keyH.leftPressed || keyH.upPressed){
            if(keyH.upPressed){
                direction = "up";
            } else if(keyH.downPressed){
                direction = "down";
            } else if(keyH.leftPressed){
                direction = "left";
            } else {
                direction = "right";
            }

            // Collision Detection
            collisionOn = false;
            gp.cChecker.checkTile(this);

            // CHECK OBJECT COLLISION
            int objIndex = gp.cChecker.checkObject(this, true);
            pickUpObject(objIndex);

            // If collision is false, player can move.

            if(!collisionOn){
                switch(direction){
                    case "up": worldY -= speed; break;
                    case "down": worldY += speed; break;
                    case "right": worldX += speed; break;
                    case "left": worldX -= speed; break;
                }
            }

            spriteCounter++;
            if(spriteCounter > 13){
                if(spriteNum == 1){
                    spriteNum = 2;
                } else if(spriteNum == 2){
                    spriteNum = 1;
                }
                spriteCounter = 0;
            }
        }

    }

    public void pickUpObject(int i) {
        if(i != 999){
            String objectName = gp.obj[i].name;

            switch (objectName){
                case "RedCaster", "RedMelee":
                    gp.playSE(0, 2.0f);
                    hasRedMinion++;
                    gp.obj[i] = null;
                    gp.ui.showMessage("You Killed a Red Minion!");
                    break;
                case "BlueMelee", "BlueCaster":
                    gp.playSE(0, 2.0f);
                    hasBlueMinion++;
                    gp.obj[i] = null;
                    gp.ui.showMessage("You Killed a Blue Minion!");
                    break;
                case "RedTowerCrystal":
                    if(hasRedMinion >= 2){
                        destroyedTurretsCounter++;
                        gp.playSE(1, 2.0f);
                        gp.obj[i] = null;
                        gp.ui.showMessage("You destroyed a Tower Piece!");
                        hasRedMinion -= 2;
                    } else{
                        gp.ui.showMessage("You need to kill 2 Red Minions!");
                    }
                    if(destroyedTurretsCounter == 24){
                        gp.ui.gameFinished = true;
                        gp.stopMusic();

                    }
                    break;
                case "BlueTowerCrystal":
                    if(hasBlueMinion >= 2){
                        destroyedTurretsCounter++;
                        gp.playSE(1, 2.0f);
                        gp.obj[i] = null;
                        gp.ui.showMessage("You destroyed a Tower Piece!");
                        hasBlueMinion -= 2;
                    } else{
                        gp.ui.showMessage("You need to kill 2 Blue Minions!");
                    }
                    if(destroyedTurretsCounter == 24){
                        gp.ui.gameFinished = true;
                        gp.stopMusic();

                    }
                    break;
                case "Boot":
                    hasBoot++;
                    speed += 3;
                    gp.ui.showMessage("You collected boots!");
                    gp.obj[i] = null;
                    break;
            }
        }
    }

    public void draw(Graphics2D g2){


        BufferedImage image = null;

        switch (direction) {
            case "up":
                if(spriteNum == 1){
                    image = up1;
                }
                if(spriteNum == 2){
                    image = up2;
                }
                break;
            case "down":
                if(spriteNum == 1) {
                    image = down1;
                }
                if(spriteNum == 2){
                    image = down2;
                }
                break;
            case "right":
                if(spriteNum == 1){
                    image = right1;
                }
                if(spriteNum == 2){
                    image = right2;
                }
                break;
            case "left":
                if(spriteNum == 1){
                    image = left1;
                }
                if(spriteNum == 2){
                    image = left2;
                }
            break;
        }

        g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);
    }
}
