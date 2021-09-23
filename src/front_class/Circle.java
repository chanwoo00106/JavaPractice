package front_class;

public class Circle {
    int radius;
    String name;

    public Circle() {
        radius = 1;
        name = "";
    }
    public Circle(int radius, String name) {
        this.radius = radius;
        this.name = name;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Circle p = new Circle(10, "자바피자");
        double area = p.getArea();
        System.out.println(p.name + "의 면적은 " + area);

        Circle donut = new Circle();
        donut.name = "도넛 피자";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
