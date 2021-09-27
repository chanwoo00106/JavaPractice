package chap06;

public class StudentTest {
    public static void main(String[] args) {
        Student1 s = new Student1("변찬우", 123456, 1205);
        Student1 s1 = new Student1("선채훈", 123456, 1207);

        System.out.printf("%s %s %s\n", s.name, s.ssn, s.hakbun);
        System.out.printf("%s %s %s\n", s1.name, s1.ssn, s1.hakbun);
        s.fall();
    }
}
