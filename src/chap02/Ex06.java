package chap02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int input = sc.nextInt();
            if (input < 0) continue;
            sum += input;

        }
        System.out.println("결과 : " + sum);

    }
}
