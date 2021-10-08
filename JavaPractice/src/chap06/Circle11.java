package chap06;

public class Circle11 {
    public int r;
    public double PI = Math.PI;

    public Circle11(int r) {
        this.r = r;
    }

    public double findArea() {
        return Math.round(PI * (r * r));
    }
}
