package main;

import object.OBJ_BlueCaster;
import object.OBJ_RedCaster;

import java.awt.*;
import java.awt.image.BufferedImage;

public class UI {
    GamePanel gp;
    Font arial_40;
    BufferedImage blueMinionImage;
    BufferedImage redMinionImage;
    public UI(GamePanel gp){
        this.gp = gp;
        arial_40 = new Font("Arial", Font.PLAIN, 20);
        OBJ_RedCaster redCaster = new OBJ_RedCaster();
        redMinionImage = redCaster.image;
        OBJ_BlueCaster blueCaster = new OBJ_BlueCaster();
        blueMinionImage = blueCaster.image;
    }

    public void draw (Graphics2D g2){
        g2.setFont(arial_40);
        g2.setColor(Color.black);
        g2.drawImage(blueMinionImage, 25, 50, gp.tileSize, gp.tileSize, null);
        g2.drawString("x " + gp.player.hasBlueMinion, 70, 80);
        g2.drawImage(redMinionImage, 120, 50, gp.tileSize, gp.tileSize, null);
        g2.drawString("x " + gp.player.hasRedMinion, 170, 80);
    }
}
