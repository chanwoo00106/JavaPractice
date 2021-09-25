package chap06;

public class Vehicle {
    static String color;
    static int speed;

    public Vehicle(String color, int speed) {
        Vehicle.color = color;
        Vehicle.speed = speed;
    }

    static void show() {
        System.out.println("color : " + color + ", speed : " + speed);
    }
}
