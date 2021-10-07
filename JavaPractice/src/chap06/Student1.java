package chap06;

public class Student1 extends People{
    int hakbun;

    public Student1(String name, int ssn, int hakbun) {
        super(name, ssn);
        this.hakbun = hakbun;
    }

    @Override
    void fall() {
        System.out.println("나는 사람이면서 학생입니다");
    }
}
