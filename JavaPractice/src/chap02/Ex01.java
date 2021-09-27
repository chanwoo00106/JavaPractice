package chap02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int input = sc.nextInt();

//        System.out.println(input % 2 == 0 ? "짝수" : "홀수");
//
//        System.out.println(input % 3 == 0 ? "3의 배수": "3의 배수가 아닙니다.");

        System.out.println(input % 3 == 0 && input % 5 == 0 ? "3의 배수이자 5의 배수": "3의 배수이자 5의 배수 아님");
    }
}
