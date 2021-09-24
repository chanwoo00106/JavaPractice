package chap06;

import java.util.ArrayList;

public class Person {
    String name;
    int age;
    ArrayList<String> arr = new ArrayList<>(10);

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        arr.add("이름");
        arr.add(name);
        arr.add("나이");
        arr.add(String.valueOf(age));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        arr.set(1, name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        arr.set(3, String.valueOf(age));
    }
    void show() {
        System.out.print("사람[");
    }
}
