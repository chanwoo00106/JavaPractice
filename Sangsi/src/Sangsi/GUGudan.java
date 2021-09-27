package Sangsi;

import java.util.Scanner;

public class GUGudan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int dan = s.nextInt();
        for (int i = 1; i <= 9; i++){
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
    }
}
