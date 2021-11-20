package chap14;

import javax.swing.*;
import java.awt.*;

class A extends JFrame {
    A() {
        setTitle("css였다면...");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JTextArea ta = new JTextArea();
        JScrollPane sp = new JScrollPane(ta);
        add(sp, BorderLayout.CENTER);

        setSize(300,200);
        setVisible(true);
    }
}

public class TextArea {
    public static void main(String[] args) {
        new A();
    }
}
