package chap02;

public class Ex03 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + (i != 10 ? " + " : " = "));
            sum += i;
        }
        System.out.print(sum);
    }
}
