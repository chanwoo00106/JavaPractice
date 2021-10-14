package test4;


class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void show() {
        System.out.println("사람[이름 : " + name + ", 나이 : " + age + "]");
    }
}

class Student extends Person {
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

class ForeignStudent extends Student {
    String nationality;

    public ForeignStudent(String name, int age, int classNum, String nationality) {
        super(name, age, classNum);
        this.nationality = nationality;
    }

    public void show() {
        System.out.println("외국학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + classNum + ", 국적 : " + nationality + "]");
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person[] p = {new Person("길동이", 22), new Student("황진이", 23, 100), new ForeignStudent("Amy", 30, 200,"U.S.A")};

        for (Person i: p) {
            i.show();
        }
    }
}
