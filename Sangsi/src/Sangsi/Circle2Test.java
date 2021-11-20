package Sangsi;

interface Shape{
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.println("다시 그림을 그립니다.");
        draw();
    }
}

class Circle2 implements Shape {
    int radius;

    Circle2(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("반지름은 " + radius + "입니다.");
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}

public class Circle2Test  {
    public static void main(String[] args) {
        Shape donut = new Circle2(10);
        donut.redraw();
        System.out.println("면적은 " + donut.getArea());
    }
}
