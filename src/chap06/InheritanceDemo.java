package chap06;

public class InheritanceDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Ball b1 = new Ball("빨간색");
//        c1.secret();
        c1.findRadius();
        c1.findArea();

        System.out.println("공 : ");
        b1.findRadius();//상속 받음
//        b1.findColor;
        b1.findArea(); // 메서드 오버라이딩: 부모클래스의 메서드가 자식클래스에도
        // 적합하다면 그대로 사용할 수 있다. 하지만 적합하지 않다면 자식 클래스는 물려받은
        // 메서드를 자신에게 맞도록 수정해야 한다. 이를 메서드 오버라이딩이라 한다.
    }
}
