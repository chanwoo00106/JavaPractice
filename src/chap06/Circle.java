package chap06;

public class Circle {
    private void secret() {
        System.out.println("쉿! 비밀이닷!");
    }
    protected void findRadius() {
        System.out.println("반지름이 10.0cm이다.");
    }
    public void findArea() {
        System.out.println("넓이는 (π*반지름*반지름)이다");
    }
}
