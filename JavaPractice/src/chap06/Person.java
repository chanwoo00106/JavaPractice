package chap06;

import java.util.ArrayList;

public class Person {
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
