package chap14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class T extends JFrame {
    T() {
        setTitle("텍스트필드 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("아이디 "));
        c.add(new JTextField(20));
        c.add(new JLabel("비밀번호 "));
        c.add(new JTextField("", 18));
        c.add(new JLabel("비밀번호 확인 "));
        c.add(new JTextField("", 15));

        setSize(300,150);
        setVisible(true);
    }
}

public class TextField {
    public static void main(String[] args) {
        new T();
    }
}
