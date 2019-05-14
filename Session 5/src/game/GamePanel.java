package game;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    Player player;
    Background background;
    // game.PlayerBullet bullet;
    // ArrayList: add(), remove(), size(), get()

    public GamePanel() {
        player = new Player();
        background = new Background();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        background.render(g);
        player.render(g);
        for(int i= 0; i <GameObject.objects.size(); i++) {
            GameObject object = GameObject.objects

        }
    }

    public void gameLoop() {
        long lastTime = 0;
        while (true) {
            long currentTime = System.currentTimeMillis();
            if (currentTime - lastTime > 1000 / 60) {
                // run logic
                this.runAll();
                // render
                this.repaint();
                lastTime = currentTime;
            }
        }
    }

    public void runAll() {
        // player run
        player.run();
        // background run
        background.run();
    }
}
