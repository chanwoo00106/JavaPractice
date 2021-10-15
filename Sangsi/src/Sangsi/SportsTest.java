package Sangsi;

class Sports {
    private String name;

    public Sports(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void rule() {
    }
}

class BaseBall extends Sports{
    int player;

    public BaseBall(String name, int player) {
        super(name);
        this.player = player;
    }

    void rule() {
        System.out.println("경기종목 : " + getName());
        System.out.println("플레이어 : " + player);
        System.out.println("경기 규칙 : 야구 규칙을 따름");
    }
}

class PingPong extends Sports {
    String team;

    public PingPong(String name, String team) {
        super(name);
        this.team = team;
    }

    void rule() {
        System.out.println("경기종목 : " + getName());
        System.out.println("경기방식 : " + team);
        System.out.println("경기 규칙 : 탁구 규칙을 따름");
    }
}

public class SportsTest {
    public static void main(String[] args) {
        Sports[] sports = {new BaseBall("BaseBall", 9), new PingPong("PingPong", "복식")};

        for (Sports i: sports) {
            i.rule();
        }
    }
}
