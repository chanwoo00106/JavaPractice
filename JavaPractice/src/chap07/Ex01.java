package chap07;

abstract class Human { // 추상 클래스 선언
    public abstract void sleep(); // 추상 메서드 선언
    public abstract void say(); // 추상 메서드 선언
}

class MinJun extends Human{ // 추상 클래스 상속
    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
    @Override
    public void say() {
        System.out.println("Hi!");
    }
}

public class Ex01{
    public static void main(String[] args) {
        MinJun minJun = new MinJun();

        minJun.say();
        minJun.sleep();
    }
}
