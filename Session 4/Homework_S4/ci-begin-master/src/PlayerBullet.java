import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PlayerBullet {
    BufferedImage image,image2,image3;
    Vector2D position,position2,position3;

    public PlayerBullet(){
        image = SpriteUtils.loadImage("assets/images/player-bullets/a/1.png");
        image2 = SpriteUtils.loadImage("assets/images/player-bullets/a/0.png");
        image3 = SpriteUtils.loadImage("assets/images/player-bullets/a/2.png");
        position = new Vector2D();
        position2 =new Vector2D();
        position3 = new Vector2D();

    }
    public void render(Graphics g){
        g.drawImage(image,(int)position.x,(int)position.y,null);
        g.drawImage(image2,(int)position2.x,(int)position2.y,null);
        g.drawImage(image3,(int)position3.x,(int)position3.y,null);
    }

    public void run(){
        position.y -=3.5;
        position2.y-=3;
        position2.x-=0.5;
        position3.y-=3;
        position3.x+=0.5;
    }
}