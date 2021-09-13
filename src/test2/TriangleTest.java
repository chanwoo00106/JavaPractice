package test2;

class Triangle {
    double base;
    double width;
    public Triangle(double base, double width) {
        this.base = base;
        this.width = width;
    }

    public double findArea() {
        return (base * width) / 2;
    }

    public boolean isSameArea(Triangle base2) {
        System.out.println(base2.findArea());
        return base == base2.findArea();
    }
}

public class TriangleTest {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10.0, 5.0);
        Triangle t2 = new Triangle(5.0, 10.0);
        Triangle t3 = new Triangle(8.0, 8.0);

        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));
    }
}
