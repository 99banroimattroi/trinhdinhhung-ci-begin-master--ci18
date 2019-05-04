import tklibs.Mathx;
import tklibs.SpriteUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GamePanel extends JPanel {
    BufferedImage playerImage;


    BufferedImage backgroundImage;
    int backgroundX;
    int backgroundY;

    Vector2D playerPosition;



    public GamePanel() {
        backgroundImage = SpriteUtils.loadImage("assets/images/background/0.png");
        backgroundX = 0;
        backgroundY = backgroundImage.getHeight()*(-1)+600;

        playerPosition = new Vector2D(200,500);


        playerImage = SpriteUtils.loadImage("assets/images/players/straight/0.png");
//        playerPosition = 200;
//        playerPosition = 300;

    }

    public void gameLoop() {
        long lastTime = 0;
        while(true)  {
//            long currentTime = System.currentTimeMillis();   // 1000/60
            long currentTime = System.nanoTime();
            if(currentTime - lastTime > 1000000000/60) {
                System.out.println(currentTime - lastTime);
                //run logic
                this.runAll();
                //render

                this.repaint();
                lastTime = currentTime;
                }
            }
        }

    public void runAll() {
        //player run
        if(KeyEventPress.isUpPress) {
            playerPosition.y -=5;
        }
        if(KeyEventPress.isDownPress) {
            playerPosition.y +=5;
        }
        if(KeyEventPress.isLeftPress) {
            playerPosition.x -=5;
        }
        if(KeyEventPress.isRightPress) {
            playerPosition.x +=5;
        }
        playerPosition.x = Mathx.clamp(playerPosition.x,0, 384-25);

        playerPosition.y = Mathx.clamp(playerPosition.y, 0 ,600-48);
        //background run
        backgroundY ++;
        if (backgroundY >= 0) {
            backgroundY = 0;

        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
//        g.drawRect(100,100,200,200);
//        g.setColor(Color.red);
//        g.fillRect(400,100,200,200);

        g.drawImage(backgroundImage, backgroundX, backgroundY,null);
        g.drawImage(playerImage,(int)playerPosition.x,(int)playerPosition.y, null);
    }
}
