package chap02;

public class Ex08 {
    public static void main(String[] args) {
        int sum = sum();
        System.out.println(sum);
    }
    public static int sum(){
        int sum = 0;
        for (int i = 1; i <= 10; i++) sum += i;
        return sum;
    }
}
