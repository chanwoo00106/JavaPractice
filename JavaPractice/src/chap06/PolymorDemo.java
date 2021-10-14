package chap06;

class Sportscar2 extends car2{
    void whoami() {
        System.out.println("나는 스포츠카다.");
    }
}

public class PolymorDemo {
    public static void main(String[] args) {
        Vehicle2[] v = new Vehicle2[2];

        v[0] = new car2();
        v[1] = new Sportscar2();
        for (Vehicle2 i: v){
            i.whoami();
        }
    }
}
