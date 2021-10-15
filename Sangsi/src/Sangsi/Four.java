package Sangsi;

class SharpPencil {
    private int width;
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

class BallPen extends SharpPencil{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

public class Four {
    public static void main(String[] args) {
        BallPen b = new BallPen();
        b.getAmount();
    }
}
