package game.rendercer;

import game.GameObject;
import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

public class Rendecer {
    BufferedImage image;
    ArrayList<BufferedImage> images;

    public Rendecer(String url) throws  Exception{
        File source = new File(url);
        if (source.exists() && source.isFile()) {
            image = SpriteUtils.loadImage(url);
        }
        else if (source.exists() && source.isDirectory()){
            images = SpriteUtils.loadImage(url);
        }
    }
    public void  render(Graphics g, GameObject master) {
        if (image != null) {
            g.drawImage(image, (int) master.position.x, (int) master.position.y, null);
            )

        }
    }
}
