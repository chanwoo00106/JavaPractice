package chap02;

import java.util.Scanner;

public class CoffeePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price;

        System.out.print("무슨 음료를 주문하시겠습니까? : ");
        String order = sc.next();

        switch (order) {
            case "에스프레소":
            case "아메리카노":
                price = 4000;
                break;
            case "카푸치노":
                price = 4500;
                break;
            default:
                price = 5000;
        }

        System.out.printf("주문하신 음료의 가격은 %d원 입니다.", price);
    }
}
