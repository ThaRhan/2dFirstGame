package object;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;

public class OBJ_Boot extends SuperObject{
    public OBJ_Boot(){
        name = "Boot";
        try{
            image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/objects/boot.png")));
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }

}
