package main;

import object.*;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }

    public void setObject(){
        gp.obj[0] = new OBJ_BlueCaster();
        gp.obj[0].worldX = 4 * gp.tileSize;
        gp.obj[0].worldY = 27 * gp.tileSize;

        gp.obj[1] = new OBJ_BlueCaster();
        gp.obj[1].worldX = 5 * gp.tileSize;
        gp.obj[1].worldY = 27 * gp.tileSize;

        gp.obj[2] = new OBJ_BlueCaster();
        gp.obj[2].worldX = 24 * gp.tileSize;
        gp.obj[2].worldY = 27 * gp.tileSize;

        gp.obj[3] = new OBJ_BlueCaster();
        gp.obj[3].worldX = 25 * gp.tileSize;
        gp.obj[3].worldY = 27 * gp.tileSize;

        gp.obj[4] = new OBJ_BlueCaster();
        gp.obj[4].worldX = 46 * gp.tileSize;
        gp.obj[4].worldY = 27 * gp.tileSize;

        gp.obj[5] = new OBJ_BlueCaster();
        gp.obj[5].worldX = 47 * gp.tileSize;
        gp.obj[5].worldY = 27 * gp.tileSize;

        gp.obj[6] = new OBJ_BlueMelee();
        gp.obj[6].worldX = 4 * gp.tileSize;
        gp.obj[6].worldY = 26 * gp.tileSize;

        gp.obj[7] = new OBJ_BlueMelee();
        gp.obj[7].worldX = 5 * gp.tileSize;
        gp.obj[7].worldY = 26 * gp.tileSize;

        gp.obj[8] = new OBJ_BlueMelee();
        gp.obj[8].worldX = 24 * gp.tileSize;
        gp.obj[8].worldY = 26 * gp.tileSize;

        gp.obj[9] = new OBJ_BlueMelee();
        gp.obj[9].worldX = 25 * gp.tileSize;
        gp.obj[9].worldY = 26 * gp.tileSize;

        gp.obj[10] = new OBJ_BlueMelee();
        gp.obj[10].worldX = 46 * gp.tileSize;
        gp.obj[10].worldY = 26 * gp.tileSize;

        gp.obj[11] = new OBJ_BlueMelee();
        gp.obj[11].worldX = 47 * gp.tileSize;
        gp.obj[11].worldY = 26 * gp.tileSize;

        gp.obj[12] = new OBJ_RedMelee();
        gp.obj[12].worldX = 4 * gp.tileSize;
        gp.obj[12].worldY = 25 * gp.tileSize;

        gp.obj[13] = new OBJ_RedMelee();
        gp.obj[13].worldX = 5 * gp.tileSize;
        gp.obj[13].worldY = 25 * gp.tileSize;

        gp.obj[14] = new OBJ_RedMelee();
        gp.obj[14].worldX = 24 * gp.tileSize;
        gp.obj[14].worldY = 25 * gp.tileSize;

        gp.obj[15] = new OBJ_RedMelee();
        gp.obj[15].worldX = 25 * gp.tileSize;
        gp.obj[15].worldY = 25 * gp.tileSize;

        gp.obj[16] = new OBJ_RedMelee();
        gp.obj[16].worldX = 46 * gp.tileSize;
        gp.obj[16].worldY = 25 * gp.tileSize;

        gp.obj[17] = new OBJ_RedMelee();
        gp.obj[17].worldX = 47 * gp.tileSize;
        gp.obj[17].worldY = 25 * gp.tileSize;

        gp.obj[48] = new OBJ_RedMelee();
        gp.obj[48].worldX = 5 * gp.tileSize;
        gp.obj[48].worldY = 12 * gp.tileSize;

        gp.obj[49] = new OBJ_RedMelee();
        gp.obj[49].worldX = 6 * gp.tileSize;
        gp.obj[49].worldY = 12 * gp.tileSize;

        gp.obj[50] = new OBJ_RedMelee();
        gp.obj[50].worldX = 25 * gp.tileSize;
        gp.obj[50].worldY = 12 * gp.tileSize;

        gp.obj[51] = new OBJ_RedMelee();
        gp.obj[51].worldX = 26 * gp.tileSize;
        gp.obj[51].worldY = 12 * gp.tileSize;

        gp.obj[52] = new OBJ_RedMelee();
        gp.obj[52].worldX = 45 * gp.tileSize;
        gp.obj[52].worldY = 12 * gp.tileSize;

        gp.obj[53] = new OBJ_RedMelee();
        gp.obj[53].worldX = 46 * gp.tileSize;
        gp.obj[53].worldY = 12 * gp.tileSize;

        gp.obj[18] = new OBJ_RedCaster();
        gp.obj[18].worldX = 4 * gp.tileSize;
        gp.obj[18].worldY = 24 * gp.tileSize;

        gp.obj[19] = new OBJ_RedCaster();
        gp.obj[19].worldX = 5 * gp.tileSize;
        gp.obj[19].worldY = 24 * gp.tileSize;

        gp.obj[20] = new OBJ_RedCaster();
        gp.obj[20].worldX = 24 * gp.tileSize;
        gp.obj[20].worldY = 24 * gp.tileSize;

        gp.obj[21] = new OBJ_RedCaster();
        gp.obj[21].worldX = 25 * gp.tileSize;
        gp.obj[21].worldY = 24 * gp.tileSize;

        gp.obj[22] = new OBJ_RedCaster();
        gp.obj[22].worldX = 46 * gp.tileSize;
        gp.obj[22].worldY = 24 * gp.tileSize;

        gp.obj[23] = new OBJ_RedCaster();
        gp.obj[23].worldX = 47 * gp.tileSize;
        gp.obj[23].worldY = 24 * gp.tileSize;

        gp.obj[54] = new OBJ_RedCaster();
        gp.obj[54].worldX = 5 * gp.tileSize;
        gp.obj[54].worldY = 13 * gp.tileSize;

        gp.obj[55] = new OBJ_RedCaster();
        gp.obj[55].worldX = 6 * gp.tileSize;
        gp.obj[55].worldY = 13 * gp.tileSize;

        gp.obj[56] = new OBJ_RedCaster();
        gp.obj[56].worldX = 25 * gp.tileSize;
        gp.obj[56].worldY = 13 * gp.tileSize;

        gp.obj[57] = new OBJ_RedCaster();
        gp.obj[57].worldX = 26 * gp.tileSize;
        gp.obj[57].worldY = 13 * gp.tileSize;

        gp.obj[58] = new OBJ_RedCaster();
        gp.obj[58].worldX = 45 * gp.tileSize;
        gp.obj[58].worldY = 13 * gp.tileSize;

        gp.obj[59] = new OBJ_RedCaster();
        gp.obj[59].worldX = 46 * gp.tileSize;
        gp.obj[59].worldY = 13 * gp.tileSize;


        gp.obj[24] = new OBJ_RedTowerCrystal();
        gp.obj[24].worldX = 7 * gp.tileSize;
        gp.obj[24].worldY = 5 * gp.tileSize;

        gp.obj[25] = new OBJ_RedTowerCrystal();
        gp.obj[25].worldX = 8 * gp.tileSize;
        gp.obj[25].worldY = 5 * gp.tileSize;

        gp.obj[26] = new OBJ_RedTowerCrystal();
        gp.obj[26].worldX = 27 * gp.tileSize;
        gp.obj[26].worldY = 5 * gp.tileSize;

        gp.obj[27] = new OBJ_RedTowerCrystal();
        gp.obj[27].worldX = 28 * gp.tileSize;
        gp.obj[27].worldY = 5 * gp.tileSize;

        gp.obj[28] = new OBJ_RedTowerCrystal();
        gp.obj[28].worldX = 41 * gp.tileSize;
        gp.obj[28].worldY = 5 * gp.tileSize;

        gp.obj[29] = new OBJ_RedTowerCrystal();
        gp.obj[29].worldX = 42 * gp.tileSize;
        gp.obj[29].worldY = 5 * gp.tileSize;

        gp.obj[30] = new OBJ_RedTowerCrystal();
        gp.obj[30].worldX = gp.tileSize;
        gp.obj[30].worldY = 17 * gp.tileSize;

        gp.obj[31] = new OBJ_RedTowerCrystal();
        gp.obj[31].worldX = 2 * gp.tileSize;
        gp.obj[31].worldY = 17 * gp.tileSize;

        gp.obj[32] = new OBJ_RedTowerCrystal();
        gp.obj[32].worldX = 21 * gp.tileSize;
        gp.obj[32].worldY = 18 * gp.tileSize;

        gp.obj[33] = new OBJ_RedTowerCrystal();
        gp.obj[33].worldX = 22 * gp.tileSize;
        gp.obj[33].worldY = 18 * gp.tileSize;

        gp.obj[34] = new OBJ_RedTowerCrystal();
        gp.obj[34].worldX = 47 * gp.tileSize;
        gp.obj[34].worldY = 18 * gp.tileSize;

        gp.obj[35] = new OBJ_RedTowerCrystal();
        gp.obj[35].worldX = 48 * gp.tileSize;
        gp.obj[35].worldY = 18 * gp.tileSize;

        gp.obj[36] = new OBJ_BlueTowerCrystal();
        gp.obj[36].worldX = gp.tileSize;
        gp.obj[36].worldY = 30 * gp.tileSize;

        gp.obj[37] = new OBJ_BlueTowerCrystal();
        gp.obj[37].worldX = 2 * gp.tileSize;
        gp.obj[37].worldY = 30 * gp.tileSize;

        gp.obj[38] = new OBJ_BlueTowerCrystal();
        gp.obj[38].worldX = 7 * gp.tileSize;
        gp.obj[38].worldY = 38 * gp.tileSize;

        gp.obj[39] = new OBJ_BlueTowerCrystal();
        gp.obj[39].worldX = 8 * gp.tileSize;
        gp.obj[39].worldY = 38 * gp.tileSize;

        gp.obj[40] = new OBJ_BlueTowerCrystal();
        gp.obj[40].worldX = 21 * gp.tileSize;
        gp.obj[40].worldY = 30 * gp.tileSize;

        gp.obj[41] = new OBJ_BlueTowerCrystal();
        gp.obj[41].worldX = 22 * gp.tileSize;
        gp.obj[41].worldY = 30 * gp.tileSize;

        gp.obj[42] = new OBJ_BlueTowerCrystal();
        gp.obj[42].worldX = 47 * gp.tileSize;
        gp.obj[42].worldY = 30 * gp.tileSize;

        gp.obj[43] = new OBJ_BlueTowerCrystal();
        gp.obj[43].worldX = 48 * gp.tileSize;
        gp.obj[43].worldY = 30 * gp.tileSize;

        gp.obj[44] = new OBJ_BlueTowerCrystal();
        gp.obj[44].worldX = 26 * gp.tileSize;
        gp.obj[44].worldY = 38 * gp.tileSize;

        gp.obj[45] = new OBJ_BlueTowerCrystal();
        gp.obj[45].worldX = 27 * gp.tileSize;
        gp.obj[45].worldY = 38 * gp.tileSize;

        gp.obj[46] = new OBJ_BlueTowerCrystal();
        gp.obj[46].worldX = 41 * gp.tileSize;
        gp.obj[46].worldY = 38 * gp.tileSize;

        gp.obj[47] = new OBJ_BlueTowerCrystal();
        gp.obj[47].worldX = 42 * gp.tileSize;
        gp.obj[47].worldY = 38 * gp.tileSize;

        gp.obj[60] = new OBJ_BlueMelee();
        gp.obj[60].worldX = 4 * gp.tileSize;
        gp.obj[60].worldY = 37 * gp.tileSize;

        gp.obj[61] = new OBJ_BlueMelee();
        gp.obj[61].worldX = 5 * gp.tileSize;
        gp.obj[61].worldY = 37 * gp.tileSize;

        gp.obj[62] = new OBJ_BlueMelee();
        gp.obj[62].worldX = 22 * gp.tileSize;
        gp.obj[62].worldY = 37 * gp.tileSize;

        gp.obj[63] = new OBJ_BlueMelee();
        gp.obj[63].worldX = 23 * gp.tileSize;
        gp.obj[63].worldY = 37 * gp.tileSize;

        gp.obj[64] = new OBJ_BlueMelee();
        gp.obj[64].worldX = 44 * gp.tileSize;
        gp.obj[64].worldY = 37 * gp.tileSize;

        gp.obj[65] = new OBJ_BlueMelee();
        gp.obj[65].worldX = 45 * gp.tileSize;
        gp.obj[65].worldY = 37 * gp.tileSize;

        gp.obj[66] = new OBJ_BlueCaster();
        gp.obj[66].worldX = 4 * gp.tileSize;
        gp.obj[66].worldY = 38 * gp.tileSize;

        gp.obj[67] = new OBJ_BlueCaster();
        gp.obj[67].worldX = 5 * gp.tileSize;
        gp.obj[67].worldY = 38 * gp.tileSize;

        gp.obj[68] = new OBJ_BlueCaster();
        gp.obj[68].worldX = 22 * gp.tileSize;
        gp.obj[68].worldY = 38 * gp.tileSize;

        gp.obj[69] = new OBJ_BlueCaster();
        gp.obj[69].worldX = 23 * gp.tileSize;
        gp.obj[69].worldY = 38 * gp.tileSize;

        gp.obj[70] = new OBJ_BlueCaster();
        gp.obj[70].worldX = 44 * gp.tileSize;
        gp.obj[70].worldY = 38 * gp.tileSize;

        gp.obj[71] = new OBJ_BlueCaster();
        gp.obj[71].worldX = 45 * gp.tileSize;
        gp.obj[71].worldY = 38 * gp.tileSize;

        gp.obj[72] = new OBJ_Boot();
        gp.obj[72].worldX = 14 * gp.tileSize;
        gp.obj[72].worldY = 33 * gp.tileSize;

    }
}
