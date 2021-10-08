package chap06;

public class InstanceofDemo {
    public static void main(String[] args) {
        Stud s = new Stud();
        Person1 p = new Person1();

        System.out.println(s instanceof  Person1);
        System.out.println(p instanceof Person1);
        System.out.println(s instanceof Stud);
        System.out.println(p instanceof Stud);
    }
}
