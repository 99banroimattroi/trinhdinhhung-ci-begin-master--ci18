import org.w3c.dom.events.Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.security.KeyException;


/**
 * Created by huynq on 7/4/17.
 */
public class Program {
    public static void main(String[] args) {
//        Human person1 = new Human(); // da khoi tao
//        Human person2 = new Human("linh" , 24, "male");
//        person1.eat();
//        person2.sleep();


//        long time = System.currentTimeMillis() / 1000/60/60/24/36/ ;
//        System.out.println(System.currentTimeMillis());
//        //Tao cua so game
        JFrame windows = new JFrame();
        GamePanel panel = new GamePanel();
        panel.setBackground(Color.pink);
        panel.setPreferredSize(new Dimension(800,600));

//        panel.setBackground(new Color(50, 50 ,50 ); //tuy chinh mau or ma mau

        windows.add(panel);
        windows.pack();
        windows.setTitle("Game Touhou");
//        windows.setSize(800, 600);

        windows.setResizable(false); // khong cho nguoi dung thay doi kich thuoc cua so




        windows.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //khi tat cua so chuong trinh ket thuc luon


        KeyAdapter keyHandler = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_W)
                    KeyEventPress.isUpPress = true;
                if(e.getKeyCode() == KeyEvent.VK_S)
                    KeyEventPress.isDownPress = true;
                if (e.getKeyCode() == KeyEvent.VK_A)
                    KeyEventPress.isLeftPress = true;
                if (e.getKeyCode() == KeyEvent.VK_D)
                    KeyEventPress.isRightPress = true;
            }
            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_W)
                    KeyEventPress.isUpPress = false;
                if (e.getKeyCode() == KeyEvent.VK_S)
                    KeyEventPress.isDownPress = false;
                if (e.getKeyCode() == KeyEvent.VK_A)
                    KeyEventPress.isLeftPress = false;
                if (e.getKeyCode() == KeyEvent.VK_D)
                    KeyEventPress.isRightPress = false;
            }
        };
        windows.addKeyListener(keyHandler);
        windows.setVisible(true); //hien cua so game

        windows.setLocation(0, 0); // vi tri dau tien khi khoi tao cua so game
        panel.gameLoop();

//        Dùng cho Employee
//        Employee e1 = new Employee();
//        e1.eat();
    }
}


// alt + enter : sua loi trong code
// (fn +) shift + f6 : doi ten
// alt + ctrl + l: format code






