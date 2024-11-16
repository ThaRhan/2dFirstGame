package object;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;

public class OBJ_RedMelee extends SuperObject{
    public OBJ_RedMelee(){
        name = "RedMelee";
        try{
            image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/objects/red_melee.png")));
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
