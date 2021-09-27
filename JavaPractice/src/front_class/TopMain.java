package front_class;

class Top {
    public int a;
    public int b;
    public int sum(int x, int y){
        return x + y;
    };
}

class TopMain {
    public static void main(String[] args) {
        Top T = new Top();
        T.a = 100;
        T.b = 200;
        int s = T.sum(T.a, T.b);
        System.out.println("a는 " + T.a);
        System.out.println("b는 " + T.b);
        System.out.println("결과는 " + T.sum(T.a, T.b));
        System.out.println("s는 " + T.sum(T.a, T.b));
    }
}