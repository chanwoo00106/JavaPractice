package Sangsi;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextFloat();
        double b = s.nextFloat();

        System.out.printf("합계 : %.1f", a + b);
    }
}
