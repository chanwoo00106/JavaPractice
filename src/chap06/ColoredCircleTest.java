package chap06;

public class ColoredCircleTest {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1(5);
        ColoredCircle c = new ColoredCircle(10, "빨간색");

        c1.show();
        c.show();
    }
}
