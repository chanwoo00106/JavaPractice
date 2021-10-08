package chap06;

class Person1 {
    String name = "사람";

    void whoami() {
        System.out.println("나는 사람이다.");
    }
}

class Stud extends Person1 {
    int number = 7;
    void work() {
        System.out.println("나는 공부한다.");
    }
}

public class UpcastDemo1 {
    public static void main(String[] args) {
//        Person1 p = new Stud();

//        Person1 p;
//        p = new Stud();

        Person1 p;
        Stud s = new Stud();

        p = s;

//        자식 클래스 접근 불가
//        p.number = 1;
//        p.work();

        p.whoami();
    }
}
