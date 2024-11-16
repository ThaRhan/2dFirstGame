package object;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;

public class OBJ_BlueCaster extends SuperObject{
    public OBJ_BlueCaster(){
        name = "BlueCaster";
        try{
            image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/objects/blue_caster.png")));
        }catch(IOException e){
           throw new RuntimeException(e);
        }
    }

}
