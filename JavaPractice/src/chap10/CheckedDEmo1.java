package chap10;

public class CheckedDEmo1 {
    public static void main(String[] args) {
        System.out.println("ttt");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("ttt");
    }
}
