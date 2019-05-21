package game;

import game.rendercer.Renderer;
import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Background extends GameObject {

    public Background() {
        rendecer = new Renderer("assets/images/background/0.png");
        position.set(0, 600 - 3109);
    }

    @Override
    public void run() {
        position.y++;
        if(position.y >= 0) {
            position.y = 0;
        }
    }
}
