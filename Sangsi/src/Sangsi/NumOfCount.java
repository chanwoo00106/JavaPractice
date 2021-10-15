package Sangsi;

public class NumOfCount {
    public static void main(String[] args) {
        int[] num = {1,9,3,2,4,3,2,9,1,5};
        int[] a = {0,0,0,0,0,0,0,0,0,0};

        for (int i : num) {
            a[i] = a[i] + 1;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " : ");
            for (int j = 0; j < a[i]; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
