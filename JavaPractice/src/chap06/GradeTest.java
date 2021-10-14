package chap06;

import java.util.Scanner;

public class GradeTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Grade g = new Grade(s.nextInt(), s.nextInt(), s.nextInt());

        System.out.println("sum : "  + g.sum());
        System.out.println("avg : " + g.avg());
    }
}
