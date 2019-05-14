package game.player;

import game.Vector2D;
import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PlayerBullet { // PlayerBulletType2
    BufferedImage image;
    Vector2D position;

    public PlayerBullet() {
        image = SpriteUtils.loadImage("assets/images/player-bullets/a/1.png");
        position = new Vector2D();
    }

    public void render(Graphics g) {
        g.drawImage(image, (int) position.x, (int) position.y, null);
    }

    public void run() {
        // bay tu duoi len
        position.y -= 3;
        position.x -= 0.6;
    }

    private void deactiveIfNeeded() {
        if (position.y < -30) {
            this.deactive();
        }
    }
}
