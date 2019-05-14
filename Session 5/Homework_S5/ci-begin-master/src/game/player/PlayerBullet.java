package game.player;

import game.GameObject;
import tklibs.SpriteUtils;

public class PlayerBullet extends GameObject { // PlayerBulletType2

    public PlayerBullet() {
        image = SpriteUtils.loadImage("assets/images/player-bullets/a/1.png");
    }

    @Override
    public void run() {
        // bay tu duoi len
        position.y -= 3;
        this.deactiveIfNeeded();
    }

    private void deactiveIfNeeded() {
        if(position.y < - 30) {
            this.deactive();
        }
    }
}
