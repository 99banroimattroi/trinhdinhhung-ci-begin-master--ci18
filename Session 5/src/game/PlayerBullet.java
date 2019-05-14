package game;

import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PlayerBullet  extends  GameObject{ // PlayerBulletType2


    public PlayerBullet() {

        image = SpriteUtils.loadImage("assets/images/player-bullets/a/1.png");
    }

    @Override
    public void run() {
        // bay tu duoi len
        position.y -= 3;
        position.x -= 0.6;
    }
}
