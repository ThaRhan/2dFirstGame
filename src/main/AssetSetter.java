package main;

import object.*;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }

    public void setObject(){
        // Using the helper method to set objects
        setObject(0, new OBJ_BlueCaster(), 4, 27);
        setObject(1, new OBJ_BlueCaster(), 5, 27);
        setObject(2, new OBJ_BlueCaster(), 24, 27);
        setObject(3, new OBJ_BlueCaster(), 25, 27);
        setObject(4, new OBJ_BlueCaster(), 46, 27);
        setObject(5, new OBJ_BlueCaster(), 47, 27);
        setObject(6, new OBJ_BlueMelee(), 4, 26);
        setObject(7, new OBJ_BlueMelee(), 5, 26);
        setObject(8, new OBJ_BlueMelee(), 24, 26);
        setObject(9, new OBJ_BlueMelee(), 25, 26);
        setObject(10, new OBJ_BlueMelee(), 46, 26);
        setObject(11, new OBJ_BlueMelee(), 47, 26);
        setObject(12, new OBJ_RedMelee(), 4, 25);
        setObject(13, new OBJ_RedMelee(), 5, 25);
        setObject(14, new OBJ_RedMelee(), 24, 25);
        setObject(15, new OBJ_RedMelee(), 25, 25);
        setObject(16, new OBJ_RedMelee(), 46, 25);
        setObject(17, new OBJ_RedMelee(), 47, 25);
        setObject(18, new OBJ_RedCaster(), 4, 24);
        setObject(19, new OBJ_RedCaster(), 5, 24);
        setObject(20, new OBJ_RedCaster(), 24, 24);
        setObject(21, new OBJ_RedCaster(), 25, 24);
        setObject(22, new OBJ_RedCaster(), 46, 24);
        setObject(23, new OBJ_RedCaster(), 47, 24);
        setObject(24, new OBJ_RedTowerCrystal(), 7, 5);
        setObject(25, new OBJ_RedTowerCrystal(), 8, 5);
        setObject(26, new OBJ_RedTowerCrystal(), 27, 5);
        setObject(27, new OBJ_RedTowerCrystal(), 28, 5);
        setObject(28, new OBJ_RedTowerCrystal(), 41, 5);
        setObject(29, new OBJ_RedTowerCrystal(), 42, 5);
        setObject(30, new OBJ_RedTowerCrystal(), 1, 17);
        setObject(31, new OBJ_RedTowerCrystal(), 2, 17);
        setObject(32, new OBJ_RedTowerCrystal(), 21, 18);
        setObject(33, new OBJ_RedTowerCrystal(), 22, 18);
        setObject(34, new OBJ_RedTowerCrystal(), 47, 18);
        setObject(35, new OBJ_RedTowerCrystal(), 48, 18);
        setObject(36, new OBJ_BlueTowerCrystal(), 1, 30);
        setObject(37, new OBJ_BlueTowerCrystal(), 2, 30);
        setObject(38, new OBJ_BlueTowerCrystal(), 7, 38);
        setObject(39, new OBJ_BlueTowerCrystal(), 8, 38);
        setObject(40, new OBJ_BlueTowerCrystal(), 21, 30);
        setObject(41, new OBJ_BlueTowerCrystal(), 22, 30);
        setObject(42, new OBJ_BlueTowerCrystal(), 47, 30);
        setObject(43, new OBJ_BlueTowerCrystal(), 48, 30);
        setObject(44, new OBJ_BlueTowerCrystal(), 26, 38);
        setObject(45, new OBJ_BlueTowerCrystal(), 27, 38);
        setObject(46, new OBJ_BlueTowerCrystal(), 41, 38);
        setObject(47, new OBJ_BlueTowerCrystal(), 42, 38);
        setObject(48, new OBJ_RedMelee(), 5, 12);
        setObject(49, new OBJ_RedMelee(), 6, 12);
        setObject(50, new OBJ_RedMelee(), 25, 12);
        setObject(51, new OBJ_RedMelee(), 26, 12);
        setObject(52, new OBJ_RedMelee(), 45, 12);
        setObject(53, new OBJ_RedMelee(), 46, 12);
        setObject(54, new OBJ_RedCaster(), 5, 13);
        setObject(55, new OBJ_RedCaster(), 6, 13);
        setObject(56, new OBJ_RedCaster(), 25, 13);
        setObject(57, new OBJ_RedCaster(), 26, 13);
        setObject(58, new OBJ_RedCaster(), 45, 13);
        setObject(59, new OBJ_RedCaster(), 46, 13);
        setObject(60, new OBJ_BlueMelee(), 4, 37);
        setObject(61, new OBJ_BlueMelee(), 5, 37);
        setObject(62, new OBJ_BlueMelee(), 22, 37);
        setObject(63, new OBJ_BlueMelee(), 23, 37);
        setObject(64, new OBJ_BlueMelee(), 44, 37);
        setObject(65, new OBJ_BlueMelee(), 45, 37);
        setObject(66, new OBJ_BlueCaster(), 4, 38);
        setObject(67, new OBJ_BlueCaster(), 5, 38);
        setObject(68, new OBJ_BlueCaster(), 22, 38);
        setObject(69, new OBJ_BlueCaster(), 23, 38);
        setObject(70, new OBJ_BlueCaster(), 44, 38);
        setObject(71, new OBJ_BlueCaster(), 45, 38);
        setObject(72, new OBJ_Boot(), 14, 33);
    }

    // Helper method to set objects
    private void setObject(int index, SuperObject obj, int x, int y) {
        gp.obj[index] = obj;
        gp.obj[index].worldX = x * gp.tileSize;
        gp.obj[index].worldY = y * gp.tileSize;
    }
}
