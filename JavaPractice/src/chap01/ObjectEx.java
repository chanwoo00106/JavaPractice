package chap01;

class School extends Home{
    static int width = 100;
    static int height = 200;
    String name;

    School() {
        i++;
    }

    School(String name) {
        this.name = name;
        i++;
    }

    School(String name, String area) {
        super();
        this.name = name;
        this.area = area;
    }

    static int wide() {
        return width * height;
    }

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(double a, double b, int c) {
        return a + b + c;
    }

    public String toString() {
        return "선태윤";
    }
}

class Home {
    static int i;
    String area;
    Home() {
        i++;
    }
    Home(String area) {
        this.area = area;
    }
}

public class ObjectEx {
    public static void main(String[] args) {
        School s = new School();
        School s1 = new School("어쩌고");
        School s2 = new School("Busan");
        School s3 = new School("gwangsangu", "gwang-ju");
        System.out.println(Home.i);

//        System.out.println(s3.locate + " " + s3.name + "소프트 어쩌고");
//        /*System.out.println("너의 이름은 " + s.toString());
//        System.out.println(s.add(1,2));
//        System.out.println(s.add(1.0, 2.2));
//        System.out.println(s.add(1.1,2.2,3));*/
//        System.out.println(School.height);
//        System.out.println(School.width);
//        System.out.println(School.wide());
//        System.out.println(s1.name);
    }
}
