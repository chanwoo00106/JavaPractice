package chap06;

public class Telephone extends Phone{
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
