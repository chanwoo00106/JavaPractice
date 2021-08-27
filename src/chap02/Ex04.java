package chap02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = 0, sum = 0;
        while (input != -1){
            sum += input;
            input = sc.nextInt();
        }
        System.out.println(sum);
    }
}
