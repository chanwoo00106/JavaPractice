package chap06;

public class Cylinder extends Circle11{
    public int h;

    public Cylinder(int r, int h) {
        super(r);
        this.h = h;
    }

    @Override
    public double findArea() {
        return Math.round((2 * PI * r * r) + (2 * PI * r * h));
    }
}
