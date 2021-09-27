package chap02;

public class CircleArea {
    public static void main(String[] args) {
        final double PI = 3.14;
        // PI += 1; error
        double radius = 10.0;
        // 기본 출력
        System.out.print(radius * radius * PI);
        // 마지막에 enter
        System.out.println(radius * radius * PI);
        // c언어랑 같이 출력
        System.out.printf("원의 넓이는 %.1f", radius * radius * PI);
    }
}
