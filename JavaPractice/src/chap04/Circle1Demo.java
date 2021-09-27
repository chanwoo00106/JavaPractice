package chap04;

// private_접근자(getter), 설정자(setter)
class Circle1 {
    private double radius;

//    public void setter(double radius) {
//        this.radius = radius;
//    }
//
//    public double getter(){
//        return radius;
//    }

    double findArea() {
        return radius*radius * 3.14;
    }
    void show() {
        System.out.printf("반지름 : %.1f 원의 넓이 : %.1f", radius, findArea());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

public class Circle1Demo {
    public static void main(String[] args) {
        Circle1 c = new Circle1();
//        c.radius = 10.0 error
        c.setRadius(10.0);

        c.show();
    }
}
