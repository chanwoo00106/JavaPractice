package chap14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class My extends JFrame {
    My() {
        setTitle("hi");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JButton btn = new JButton("버튼입니다");
        btn.setBounds(50, 50, 150, 100);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicked");
            }
        });
        add(btn);

        ImageIcon img = new ImageIcon("img/Happy.jpg");
        JButton btn2 = new JButton(img);
        btn2.setBounds(250, 50, 300, 100);
        add(btn2);

        setVisible(true);
    }
}

public class Button {
    public static void main(String[] args) {
        new My();
    }
}
