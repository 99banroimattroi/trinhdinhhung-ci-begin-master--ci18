package game;

import game.physics.BoxCollider;
import game.rendercer.Renderer;

public class Item extends GameObject {
    public Item() {
        rendecer = new Renderer("assets/images/items/power-up-red.png");
        velocity.set(100, 100);
        hitBox = new BoxCollider(this, 12, 12);
    }

    @Override
    public void run(){
        super.run();
        position.y += 8;
        this.deactiveIfNeeded();
    }

    public void deactiveIfNeeded(){
        if(position.y <60){
            this.deactive();
        }
    }
}
