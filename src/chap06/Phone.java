package chap06;

public class Phone {
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
