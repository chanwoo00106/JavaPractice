package chap04;

class Circle2 {
    double radius;
    static int numOfCircles = 0;
    int numCircles = 0;

    // 생성자
    public Circle2(double radius) {
        this.radius = radius;
        numOfCircles++;
        numCircles++;
    }


}

public class Circle2Demo {
    public static void main(String[] args) {
        Circle2 C2 = new Circle2(10.0);
        Circle2 yourCircle = new Circle2(5.0);

        System.out.println(Circle2.numOfCircles);
        System.out.println(C2.numCircles);
        System.out.println(yourCircle.numCircles);
    }
}
