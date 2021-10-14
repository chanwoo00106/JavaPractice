package chap06;

public class Grade {
    int Math;
    int Kor;
    int Eng;

    public Grade(int math, int kor, int eng) {
        Math = math;
        Kor = kor;
        Eng = eng;
    }

    int sum() {
        return Math + Kor + Eng;
    }

    double avg() {
        return java.lang.Math.round((sum() / 3.0) * 10) / 10.0;
    }
}
