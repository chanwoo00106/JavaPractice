package chap02;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름, 도시, 나이, 체중, 싱글 여부를 빈칸으로 분리하여 입력하시오 : ");

        String name = sc.next();
        System.out.println("이름 " + name + " 이고");

        String city = sc.next();
        System.out.println("사는 곳은 " + city + "입니다.");

        int age = sc.nextInt();
        System.out.println("나이는 " + age + "살 이고");

        float weight = sc.nextFloat();
        System.out.println("몸무게는 " + weight + "kg 이고");

        boolean tf = sc.nextBoolean();
        System.out.println(tf ? "싱글입니다": "싱글이 아닙니다");

    }
}
