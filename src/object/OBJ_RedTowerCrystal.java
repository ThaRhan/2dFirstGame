package object;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;

public class OBJ_RedTowerCrystal extends SuperObject{
    public OBJ_RedTowerCrystal(){
        name = "RedTowerCrystal";
        try{
            image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/objects/red_turret_crystal.png")));
        }catch(IOException e){
            throw new RuntimeException(e);
        }
        collision = true;
    }

}