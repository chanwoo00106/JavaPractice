package chap06;

public class Circle11Test {
    public static void main(String[] args) {
        Circle11 c = new Circle11(5);
        Ball11 b = new Ball11(5);
        Cylinder cy = new Cylinder(5, 10);
        Cone cone = new Cone(5, 10);

        System.out.println(c.findArea());
        System.out.println(b.findArea());
        System.out.println(cy.findArea());
        System.out.println(cone.findArea());
    }
}
