package chap04;

// 연속 호출

class Person {
    String name;
    int age;

    public Person SetName(String name) {
        this.name = name;
        return this;
    }

    public Person SetAge(int age){
        this.age = age;
        return this;
    }
    public void sayHello() {
        System.out.println("안녕! 나는 " + name + "이고, 나이는 " + age + "살이야");
    }
}

public class MethodChainDemo {
    public static void main(String[] args) {
        Person p = new Person();

//        p.SetName("찬우");
//        p.SetAge(17);
//        p.sayHello();
        p.SetName("찬우").SetAge(17).sayHello();
    }
}
