package chap02;

public class Ex09 {
    public static void main(String[] args) {
        int n1 = 10, n2 = 100;
        double nd1 = 5.5, nd2 = 10.5;
        System.out.printf("%d %.1f %.1f", ForSum(n1, n2), ForSum(nd1, nd2), ForSum(n1, nd2));

    }
    public static int ForSum(int a, int b){
        int sum = 0;
        for (int i = a; i <= b; i++) sum += i;
        return sum;
    }
    // =>  -> ~> != !== >= <=
    public static double ForSum(double a, double b){
        double sum = 0;
        for (double i = a; i <= b; i++) sum += i;
        return sum;
    }
    public static double ForSum(int a, double b){
        double sum = 0;
        for (int i = a; i < b; i+= 0.5) sum += i;
        return sum;
    }
}
