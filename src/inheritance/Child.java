package inheritance;

public class Child extends Parent {
    public void show() {
        System.out.println("hello " + name);
        // private 이어서 상속받지 못함
        // System.out.println("Hi " + Pname);
    }
}
