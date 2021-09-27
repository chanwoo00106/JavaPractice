package test;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        five();
    }
    static void one() {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 19) System.out.println("성년");
        else System.out.println("미성년");
    }
    static void two() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("아주 잘했습니다.");
                break;
            case 2:
            case 3:
                System.out.println("잘했습니다");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("보통입니다");
                break;
            default:
                System.out.println("노력해야겠습니다");
                break;
        }
    }
    static void three() {
        Scanner sc = new Scanner(System.in);
        int num, r = 0;
        do {
            System.out.print("양의 정수를 입력하세요 : ");
            num = sc.nextInt();
            if (num <= 0) break;
            else if (num % 2 == 0) r += num;
        } while (true);
    }
    static void four() {
        for (int i = 0; i < 5; i++){
//            for (int j = 0; j <= i; j++){
//                System.out.print("*");
//            }
            printStar(i);
            System.out.println();
        }
    }
    static void five() {
        int cnt = 0;
        for (int i = 1; i <= 20; i++){
            for (int j = 1; j <= 20; j++) {
                for (int c = 1; c <= 20; c++){
                    if ((i*i) + (j*j) == (c*c)) System.out.println(++cnt + "번째   " + "a : " + i + " b : " + j + " c : " + c);
                }
            }
        }
    }
    static void six() {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        String y = sc.next();
        whosWin(c, y);
    }
    static void whosWin(String c, String y) {
        if (c.equals(y))System.out.println("비겼습니다.");
        else if (c.equals("r") && y.equals("s")) System.out.println("철수 승!");
        else if (c.equals("s") && y.equals("p")) System.out.println("철수 승!");
        else if (c.equals("p") && y.equals("r")) System.out.println("철수 승!");
        else if (y.equals("r") && c.equals("s")) System.out.println("영희 승!");
        else if (y.equals("s") && c.equals("p")) System.out.println("영희 승!");
        else if (y.equals("p") && c.equals("r")) System.out.println("영희 승!");
    }
    static void printStar(int i) {
        // 8 - 4번 문제
        for (int j = 0; j <= i; j++){
            System.out.print("*");
        }
    }
    static void foo(String say, int num1) {
        System.out.println(say + " " + num1);
    }
    static void foo(String say) {
        System.out.println(say);
    }
    static void foo(String say, int num1, int num2) {
        System.out.println(say + " " + num1 + " " + num2);
    }
    static void ten(){
        System.out.print("양의 정수를 입력하세요 : ");
        int num = new Scanner(System.in).nextInt();
        if (isPrime(num)) System.out.println(num + "은 소수입니다.");
        else System.out.println(num + "은 소수가 아닙니다.");
    }
    static boolean isPrime(int num) {
        for (int i = num - 1; i > 1; i--) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
