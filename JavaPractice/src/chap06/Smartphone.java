package chap06;

public class Smartphone extends Telephone{
    private String game;

    public Smartphone(String owner, String game) {
        super(owner);
        this.game = game;
    }

    void palyGame() {
        System.out.println(owner + "이가 " + game + " 게임을 하는 중이다.");
    }
}
