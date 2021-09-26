package chap06;

public class ForeignStudent extends Student{
    String nationality;

    public ForeignStudent(String name, int age, int classNum, String nationality) {
        super(name, age, classNum);
        this.nationality = nationality;
    }

    public void show() {
        System.out.println("외국학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + classNum + ", 국적 : " + nationality + "]");
    }
}
