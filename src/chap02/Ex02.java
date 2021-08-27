package chap02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        if (input >= 90) System.out.println("A");
        else if (input >= 80) System.out.println("B");
        else if (input >= 70) System.out.println("C");
        else if (input >= 60) System.out.println("D");
        else System.out.println("F");

        switch (input / 10){
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }
    }
}
