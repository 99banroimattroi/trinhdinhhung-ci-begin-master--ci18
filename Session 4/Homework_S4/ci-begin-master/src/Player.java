import tklibs.Mathx;
import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Player {
    BufferedImage image;
    Vector2D position,position2,position3;
    ArrayList<PlayerBullet> playerBullets;

    public Player() {
        image = SpriteUtils.loadImage("assets/images/players/straight/0.png");
        position = new Vector2D(200, 500);
        playerBullets = new ArrayList<>(); // playerBullets = 1 mảng rỗng
//        playerBullets.add()
//        playerBullets.remove()
//        playerBullets.size()
//        playerBullets.get()
    }

    public void render(Graphics g) {
        g.drawImage(image, (int) position.x, (int) position.y, null);
        // playerBullets render()
        for(int i = 0; i < playerBullets.size(); i++) {
            PlayerBullet bullet = playerBullets.get(i);
            bullet.render(g);
        }
    }

    int count = 0; // dem so khung hinh
    public void run() { // 60 fps >> 60 vien dan dc tao ra 1s >> 3 vien duoc tao ra 1s
        // di chuyen
        if(KeyEventPress.isUpPress) {
            position.y--;
        }
        if(KeyEventPress.isLeftPress) {
            position.x--;
        }
        if(KeyEventPress.isRightPress) {
            position.x++;
        }
        if(KeyEventPress.isDownPress) {
            position.y++;
        }
        // gioi han vi tri
        position.x = Mathx.clamp(position.x, 0, 384 - 32);
        position.y = Mathx.clamp(position.y, 0, 600 - 48);

        // ban dan
        count++;
        if(KeyEventPress.isFirePress && count > 20) {
            PlayerBullet bullet = new PlayerBullet();
            bullet.position.set(this.position.x, this.position.y);
            playerBullets.add(bullet);

            PlayerBullet bullet2 = new PlayerBullet();
            bullet2.position2.set(this.position.x - 10, this.position.y -200);
            playerBullets.add(bullet2);

            PlayerBullet bullet3 = new PlayerBullet();
            bullet3.position3.set(this.position.x + 10, this.position.y -200);
            playerBullets.add(bullet3);

            count = 0;
        }
        // playerBullets run()
        for(int i = 0; i < playerBullets.size(); i++) {
            PlayerBullet bullet = playerBullets.get(i);
            bullet.run();
        }
    }
}
