package game;

import tklibs.SpriteUtils;

public class Enemy extends GameObject {
    public Enemy() {
        image = SpriteUtils.loadImage("assets/images/enemies/level0/blue/0.png");
        position.set(200,200);
    }

    @Override
    public void run(){
        this.position.y+=3;
    }
}