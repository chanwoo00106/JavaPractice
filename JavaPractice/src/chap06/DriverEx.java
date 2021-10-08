package chap06;

class Vehicle1 {
    public void run() {
        System.out.println("차량이 달립니다.");
    }
}

class Bus extends Vehicle1 {
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}

class Texi extends Vehicle1{
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}

class Driver {
    public void drive(Vehicle1 v) {
        v.run(); // 오버라이드 된 경우 자식 메서드를 실행
    }
}

public class DriverEx {
    public static void main(String[] args) {
        Driver d = new Driver();
        Texi t = new Texi();
        d.drive(t);
        Bus b = new Bus();
        d.drive(b);
    }
}
