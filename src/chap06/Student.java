package chap06;

public class Student extends Person{
    int classNum;

    public Student(String name, int age, int classNum) {
        super(name, age);
        this.classNum = classNum;
    }

    public int getClassNum() {
        return classNum;
    }

    public void show() {
        System.out.println("학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + classNum + "]");
    }
}
