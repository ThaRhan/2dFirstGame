package object;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;

public class OBJ_RedCaster extends SuperObject{
    public OBJ_RedCaster(){
        name = "RedCaster";
        try{
            image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/objects/red_caster.png")));
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
