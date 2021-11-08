package chap10;

import java.util.StringTokenizer;

public class UnChecked1Demo {
    public static void main(String[] args) {
        String s = "Java C Python";
        StringTokenizer st = new StringTokenizer(s);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken() + " +");
        }
        System.out.println(st.nextToken());
    }
}
