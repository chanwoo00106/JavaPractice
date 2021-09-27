package chap02;

import java.util.Scanner;

public class GuGuDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("-----2단-----");
//        for (int i = 1; i <= 9; i++) {
//            System.out.println(2 + " * " + i + " = " + 2*i);
//        }

//        for (int i = 2; i <= 9; i++){
//            System.out.println("-----" + i + "단-----");
//            for (int j = 1; j <= 9; j++) {
//                System.out.println(i + " * " + j + " = " + i*j);
//            }
//        }

        int input = sc.nextInt();
        System.out.println("-----" + input + "단-----");
        for (int i = 2; i <= 9; i++) {
            System.out.println(input + " * " + i + " = " + input * i);
        }
    }
}
