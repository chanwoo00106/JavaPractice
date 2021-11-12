package chap10;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeCollection {
    public static void main(String[] args) {
        ArrayList<Integer> I = new ArrayList<>();

        for (int i = 1; i <= 10; i++)
            I.add(i);

        Collections.shuffle(I); // 섞기
        System.out.println(I);

//        Collections.sort(I, Collections.reverseOrder());
        I.sort((a, b) -> b - a); // 내림차순
        System.out.println(I);

//        Collections.sort(I);
        I.sort((a,b) -> a - b); // 오름차순
        System.out.println(I);

        System.out.println(Collections.binarySearch(I, 4));
        System.out.println(I.indexOf(4));

        I.clear();
        System.out.println(I);
    }
}
