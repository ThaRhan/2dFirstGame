package object;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;

public class OBJ_BlueTowerCrystal extends SuperObject{
    public OBJ_BlueTowerCrystal(){
        name = "BlueTowerCrystal";
        try{
            image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/objects/blue_turret_crystal.png")));
        }catch(IOException e){
            throw new RuntimeException(e);
        }
        collision = true;
    }

}