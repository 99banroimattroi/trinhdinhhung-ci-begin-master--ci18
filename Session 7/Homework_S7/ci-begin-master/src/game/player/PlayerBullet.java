package game.player;

import game.GameObject;
import game.Vector2D;
import game.enemy.Enemy;
import game.physics.BoxCollider;
import game.rendercer.Renderer;
import tklibs.SpriteUtils;

public class PlayerBullet extends GameObject { // PlayerBulletType2
    public int damage;

    public PlayerBullet() {
        rendecer = new Renderer("assets/images/player-bullets/a");
        velocity.set(0, -3);
//        hitBox = new BoxCollider(this,this.rendecer.image.getWidth(),this.rendecer.image.getHeight());
        hitBox = new BoxCollider(this, 24, 24);
        damage = 1;
    }

    @Override
    public void run() {
        super.run(); // position.add(velocity.x, velocity.y)
        this.deactiveIfNeeded();
        this.checkEnemy();
    }

    private void checkEnemy() {
        Enemy enemy = GameObject.findIntersects(Enemy.class, hitBox);
        if(enemy != null) {
            enemy.takeDamage(damage);
            this.deactive();
        }
    }

    private void deactiveIfNeeded() {
        if(position.y < -30) {
            this.deactive();
        }
    }
}
