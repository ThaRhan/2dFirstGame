package main;

import object.OBJ_BlueCaster;
import object.OBJ_Boot;
import object.OBJ_RedCaster;

import java.awt.*;
import java.awt.image.BufferedImage;

public class UI {
    GamePanel gp;
    Font arial_40, arial_80B;
    BufferedImage blueMinionImage;
    BufferedImage redMinionImage;
    BufferedImage bootImage;
    public boolean messageOn = false;
    public int messageTime = 0;
    public String message = "";
    public boolean gameFinished = false;

    public UI(GamePanel gp){
        this.gp = gp;
        arial_40 = new Font("Arial", Font.PLAIN, 20);
        arial_80B = new Font("Arial", Font.BOLD, 80);
        OBJ_RedCaster redCaster = new OBJ_RedCaster();
        redMinionImage = redCaster.image;
        OBJ_BlueCaster blueCaster = new OBJ_BlueCaster();
        blueMinionImage = blueCaster.image;
        OBJ_Boot boot = new OBJ_Boot();
        bootImage = boot.image;
    }

    public void showMessage(String text){
        message = text;
        messageOn = true;
    }


    public void draw (Graphics2D g2){

        if(gameFinished){
            g2.setFont(arial_40);
            g2.setColor(Color.black);

            String text;
            int textLength;
            int x;
            int y;

            text = "Congrats! You Have Destroyed All Turrets!";
            textLength = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth();
            x = gp.screenWidth/2 - textLength/2;
            y = gp.screenHeight/2 - (gp.tileSize*3);
            g2.drawString(text, x, y);

            g2.setFont(arial_80B);
            g2.setColor(Color.red);
            text = "YOU HAVE WON";
            textLength = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth();
            x = gp.screenWidth/2 - textLength/2;
            y = gp.screenHeight/2 + (gp.tileSize*2);
            g2.drawString(text, x, y);

            //GAME ENDS
            gp.gameThread = null;
        }else{
            g2.setFont(arial_40);
            g2.setColor(Color.black);
            g2.drawImage(blueMinionImage, 25, 50, gp.tileSize, gp.tileSize, null);
            g2.drawString("x " + gp.player.hasBlueMinion, 70, 80);
            g2.drawImage(redMinionImage, 120, 50, gp.tileSize, gp.tileSize, null);
            g2.drawString("x " + gp.player.hasRedMinion, 170, 80);

            g2.drawString("Items: ", 50, 600);
            g2.drawImage(bootImage, 110, 560, gp.tileSize, gp.tileSize, null);

            if(messageOn){
                g2.drawString(message, 300, 50);
                messageTime++;
                if(messageTime > 60){
                    messageTime = 0;
                    messageOn = false;
                }
            }
        }

    }
}
