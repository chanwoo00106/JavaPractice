package test3;

class Miner {
    String name;
    int coins = 0;

    public Miner(String name) {
        this.name = name;
    }

    void mine(int n) {
        coins += n;
    }

    void print() {
        System.out.println("name: " + name + " coins : " + coins);
    }
}

public class MinerTest {
    public static void main(String[] args) {
        Miner a = new Miner("말런");
        Miner b = new Miner("글로리아");

        a.mine(3);
        b.mine(2);

        a.print();
        b.print();
    }
}
