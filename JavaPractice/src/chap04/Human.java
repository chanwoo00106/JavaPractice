package chap04;

public class Human {
    String name;
    double height;

    void dancing() {
        System.out.println("키가 " + height + "cm인 " + name + "이/가 춤을 춘다.");
    }

    void sing() {
        System.out.println("키가 " + height + "cm인 " + name + "이/가 노래한다.");
    }
    void coding() {
        System.out.println("키가 " + height + "cm인 " + name + "이/가 JS를 한다");
    }
    void study() {
        System.out.println("키가 " + height + "cm인 " + name + "이/가 RN을 한다");
    }
}
