package chap04;

class Circle {
    double radius;
    String color;

    Circle() {}

    Circle(String color){
        this.color = color;
        this.radius = 3.1415927585;
    }

    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    Circle(double radius){
        this.radius = radius;
        this.color = "검정";
    }

    void print() {
        System.out.println(this.radius + " 반지름을 가진 " + this.color + "색 공!");
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 5.0;
        c1.color = "빨강";
        c1.print();

        Circle c2 = new Circle(10.0, "노랑");
        c2.print();

        Circle c3 = new Circle(7.0);
        c3.print();

        Circle c4 = new Circle("회");
        c4.print();
    }
}
