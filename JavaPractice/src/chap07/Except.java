package chap07;


class Error extends RuntimeException { }

public class Except{
    public static void Comment(String comment) {
        try {
            if (comment.equals("fuck")) {
                throw new Error();
            }
            System.out.println(comment);
        } catch (Error e) {
            System.out.println("욕 사용 금지!");
        }
    }

    public static void main(String[] args) {
        try {
            Comment("hello");
            Comment("fuck");
            Comment("어쩌고");
        } catch (Error e) {
            System.out.println("욕 사용 금지!");
        }
    }
}
