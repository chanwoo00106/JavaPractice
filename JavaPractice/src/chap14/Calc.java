package chap14;

import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame{
    int a = 0, b = 0;
    Calculator() {
        setTitle("계산기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        Container c = new Container();
        c.setLayout(new FlowLayout());

        c.add(input("값"));
        c.add(input("더할 값"));
        add(c);

        JButton btn = new JButton(" result");
        JLabel result = new JLabel(this.a + this.b + "");
        JPanel p = new JPanel();
        p.add(btn);
        p.add(result);

        add(p);

        setSize(500, 500);
        setVisible(true);
    }

    JPanel input(String text) {
        JLabel T = new JLabel(text + " : ");
        JTextField field = new JTextField("0", 20);
        JPanel p = new JPanel();
        p.add(T);
        p.add(field);
        return p;
    }
}

public class Calc {
    public static void main(String[] args) {
        new Calculator();
    }
}
