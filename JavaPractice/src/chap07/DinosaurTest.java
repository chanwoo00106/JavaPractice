package chap07;

class T_Rex implements Dinosaur{

    @Override
    public void cry() {
        System.out.println("꾸어어엉");
    }

    public void Walk() {
        System.out.println("걷기");
    }
}

class Ptera implements Dinosaur{
    @Override
    public void cry() {
        System.out.println("끼에에엑");
    }

    public void fly() {
        System.out.println("날기");
    }
}

public class DinosaurTest {
    public static void main(String[] args) {
        T_Rex t = new T_Rex();
        Ptera p = new Ptera();

        t.cry();
        t.Walk();
        p.cry();
        p.fly();
    }
}
