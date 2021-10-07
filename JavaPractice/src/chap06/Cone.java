package chap06;

public class Cone extends Circle11{
    public int h;

    public Cone(int r, int h) {
        super(r);
        this.h = h;
    }

    @Override
    double findArea() {
        return Math.round((PI * r * Math.sqrt((r * r) + (h * h))) + (PI * (r * r)));
    }
}
