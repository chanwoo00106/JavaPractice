package chap14;

import javax.swing.*;
import java.awt.*;

class C extends JFrame {
    C() {
        setTitle("자바 스윙 발표");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JComboBox combo = new JComboBox();
        combo.setSize(100, 30);
        add(combo);

        String[] arr = {"1","2","3","4","5","6","7","8","9"};
        JComboBox combo2 = new JComboBox(arr);
        combo2.setBounds(100, 0, 100, 30);
        add(combo2);

        setSize(500, 500);
        setVisible(true);
    }
}

public class ComboBox {
    public static void main(String[] args) {
        new C();
    }
}
