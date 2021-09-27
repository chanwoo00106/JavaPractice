package chap02;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("연산자를 입력하세요 : ");
        String opr = sc.next();

        System.out.print("두 숫자 입력하세요 : ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        if (Objects.equals(opr, "+")) System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        else if (Objects.equals(opr, "-")) System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        else if (Objects.equals(opr, "*")) System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        else if (Objects.equals(opr, "/")) System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        else if (Objects.equals(opr, "%")) System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
    }
}
