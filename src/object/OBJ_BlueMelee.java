package object;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;

public class OBJ_BlueMelee extends SuperObject{
    public OBJ_BlueMelee(){
        name = "BlueMelee";
        try{
            image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/objects/blue_melee.png")));
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
