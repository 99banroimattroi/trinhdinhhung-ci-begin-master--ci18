package game;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class GameObject { //Player, Background, PlayerBullet..
    //quan li doi tuong (static)

    public static ArrayList<GameObject> objects = new ArrayList<>();



    public static <E> E findInactive(Class<E> cls) { // Player.class || Background.class
    //cls ~ Player.class || Background.class..
        // E ~ Player || Background..
        for(int i = 0; i < objects.size(); i++) {
            GameObject object = objects.get(i);
            if (cls.isAssignableFrom(object.getClass())
                && !object.active) {
                return (E)object;

            }
        }
        //TODO
        return null;
    }

    public static void main(String[] args) {
        Player deactivatedPlayer = findInactive((Player.class));
        PlayerBullet deactivetedBullet = findInactive(PlayerBullet.class);

    }
}
    //dinh nghia doi tuong

    public BufferedImage image;
    public Vector2D position;
    public boolean active;

    public GameObject() {
        objects.add(this);
        position = new Vector2D(); //(0 ,0)
        active = true;

    }
    public void deactive(){
        active = false;
    }
    public void reset (){
        active = true;
    }

    public void render(Graphics g) {
        if (image != null) {
            g.drawImage(image, (int) position.x ,(int) position.y, null );
        }

    }
    public void run() {

    }
}
