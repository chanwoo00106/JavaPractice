package testpackage;

class Person {
    int com = 1;
    String name = "홍길동";

    void whoami() {
        System.out.println("사람");
    }
    static void like() {
        System.out.println("eat");
    }
}

class Student extends Person {
    String name = "진";

    void move() {
        System.out.println("walk");
    }
    void whoami() {
        System.out.println("학생");
    }
    static void like() {
        System.out.println("study");
    }
}

class Teacher extends Person {
    String name = "김교사";
    void move() {
        System.out.println("car");
    }
    void whoami() {
        System.out.println("선생님");
    }
    static void like() {
        System.out.println("teach");
    }
}

class One {
    private int secret = 1;
    int roomate = 2;
    protected int child = 3;
    public int anybody = 4;

    public void show() {}
}

public class Ex1 {
//    void print() {
//        One o = new One();
//        System.out.println(o.secret);
//        System.out.println(o.roomate);
//        System.out.println(o.child);
//        System.out.println(o.anybody);
//    }
    public static void main(String[] args) {
//        Student s = new Student();
//        Person ps = s;
//        ps.whoami();
//        System.out.println(ps.name);
        System.out.println("dlfkjslfkjsd" + 3 + 4);
    }
}
