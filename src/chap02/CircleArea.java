package chap02;

public class CircleArea {
    public static void main(String[] args) {
        final double PI = 3.14;
        // PI += 1; error
        double radius = 10.0;
        System.out.println(radius * radius * PI);
    }
}
