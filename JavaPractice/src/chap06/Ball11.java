package chap06;

public class Ball11 extends Circle11{
    public Ball11(int r) {
        super(r);
    }

    @Override
    double findArea() {
        return Math.round(4 * PI * (r * r));
    }
}
