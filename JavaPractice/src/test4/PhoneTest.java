package test4;

class Phone {
    protected String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    public Phone() {

    }

    void talk() {
        System.out.println(owner+"이가 통화 중이다");
    }
}

class Telephone extends Phone {
    private String when;

    public Telephone(String owner ,String when) {
        super(owner);
        this.when = when;
    }

    public Telephone(String owner) {
        super(owner);
    }

    void autoAnswering() {
        System.out.println(owner + "이가 없다. " + when + " 전화 줄래.");
    }
}

class Smartphone extends Telephone {
    private String game;

    public Smartphone(String owner, String game) {
        super(owner);
        this.game = game;
    }

    void palyGame() {
        System.out.println(owner + "이가 " + game + " 게임을 하는 중이다.");
    }
}



public class PhoneTest {
    public static void main(String[] args) {
        Phone[] phones = {new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그")};
        phones[0].talk();
        ((Telephone)phones[1]).autoAnswering();
        ((Smartphone)phones[2]).palyGame();
    }
}
