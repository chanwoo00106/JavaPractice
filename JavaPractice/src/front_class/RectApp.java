package front_class;

import java.util.Scanner;

class Rectangle {
    int width;
    int height;
    public int getArea() {
        return width * height;
    }
}

public class RectApp {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Scanner s = new Scanner(System.in);
        r.height = s.nextInt();
        r.width = s.nextInt();
        System.out.println(r.getArea());
    }
}
