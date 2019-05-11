import tklibs.Mathx;
import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player {
        public Vector2D position;
        public BufferedImage image;

        public Player() {
            this.position = new Vector2D();
            this.image = SpriteUtils.loadImage()

        }

        public void render(Graphics g)  {
            g.drawImage(
                    this.image,
                    (int)
        )
        }

        public run(){
            if(KeyEventPress.isUpPress) {
                this.position.y -=5;
            }
            if(KeyEventPress.isDownPress) {
                this.position.y +=5;
            }
            if(KeyEventPress.isLeftPress) {
                this.position.x -=5;
            }
            if(KeyEventPress.isRightPress) {
                this.position.x +=5;
            }
            this.position.x = Mathx.clamp(this.position.x,0, 384-25);

            this.position.y = Mathx.clamp(this.position.y, 0 ,600-48);
        }

        public void shoot() {
            if (KeyEventPress.isFirePress) {
                PlayerBuller newBullet = new PlayerBullet();
                newBullet.position.set(this.position)
        }


    }

}
