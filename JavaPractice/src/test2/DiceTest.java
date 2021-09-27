package test2;

class Dice {
    int face = 6;
    public int roll() {
        return (int)(Math.random() * face) + 1;
    }
}

public class DiceTest {
    public static void main(String[] args) {
        Dice d = new Dice();
        System.out.println("주사위의 숫자 : " + d.roll());
    }
}
