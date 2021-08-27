package chap02;

public class Ex05 {
    public static void alpha() {
        char a = 'a';
        do {
            System.out.print(a + " ");
            a++;
        } while(a <= 'z');
    }

    public static void main(String[] args) {
        alpha();
    }
}
