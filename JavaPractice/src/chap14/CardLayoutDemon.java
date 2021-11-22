package chap14;

import javax.swing.*;
import java.awt.*;

public class CardLayoutDemon extends JFrame {
    CardLayout layout;

    public void rotate() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (Exception e){

            } layout.next(this.getContentPane());
        }
    }

    CardLayoutDemon() {
        setTitle("카드레이아웃");
        layout = new CardLayout();
        setLayout(layout);

        add("0", new JButton("독균"));
        add("1", new JButton("도윤"));
        add("2", new JButton("독윤"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 110);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CardLayoutDemon().rotate();
    }
}
