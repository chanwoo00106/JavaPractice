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
        Dinosaur[] d = {new T_Rex(), new Ptera()};
        d[0].cry();
        ((T_Rex)d[0]).Walk();
        d[1].cry();
        ((Ptera)d[1]).fly();
    }
}
