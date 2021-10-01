package foreach;

import java.util.Scanner;

public class Three {
    public enum ranking {
        A("최우수"),
        B("우수"),
        C("보통"),
        D("미흡"),
        E("탈락");

        private final String ranking;

        ranking(String ran) {
            this.ranking = ran;
        }

        public void s(){
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numOfStudents = 0;
        int[] scores;
        Scanner in = new Scanner(System.in);
        System.out.print("학생 수? ");
        numOfStudents = in.nextInt();
        scores = new int[numOfStudents];

        System.out.println(numOfStudents + "명의 학생 성적을 입력하세요.");
        for(int i = 0; i < numOfStudents; i++){
            scores[i] = in.nextInt();
        }

        System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다.");
        for (int i :scores){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < numOfStudents; i++){
            if (scores[i] >= 90) System.out.println((i + 1) + "번 학생의 등급은 " + ranking.A.ranking + "입니다.");
            else if (scores[i] >= 80) System.out.println((i + 1) + "번 학생의 등급은 " + ranking.B.ranking +"입니다.");
            else if (scores[i] >= 70) System.out.println((i + 1) + "번 학생의 등급은 " + ranking.C.ranking + "입니다.");
            else if (scores[i] >= 60) System.out.println((i + 1) + "번 학생의 등급은 " + ranking.D.ranking + "입니다.");
            else System.out.println((i + 1) + "번 학생의 등급은 " + ranking.E.ranking + "입니다.");
        }
    }
}
