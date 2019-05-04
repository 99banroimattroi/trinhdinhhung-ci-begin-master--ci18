import tklibs.SpriteUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class chayanhnen extends JPanel {
    BufferedImage anhnenImage;
    int anhnenX;
    int anhnenY;

    public chayanhnen () {
        anhnenImage = SpriteUtils.loadImage("assets/images/background/0.png");
        anhnenX = 0;
        anhnenY = 0;
    }

    public void gameLoop() {
        long lastTime = 0;
        while(true)  {
//            long currentTime = System.currentTimeMillis();   // 1000/60
            long currentTime = System.nanoTime();
            if(currentTime - lastTime > 1000000000/60) {
                //run logic
                anhnenX++;


                //render
                System.out.println(currentTime - lastTime);
                this.repaint();
                lastTime = currentTime;
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("paint");
        super.paint(g);
        g.drawImage(anhnenImage, anhnenX, anhnenY, null);
    }
}
