package test2;

class Printer {
    private int numOfPapers = 0;
    private  boolean duplex;

    public Printer(int numOfPapers ,boolean duplex) {
        this.duplex = duplex;
        this.numOfPapers = numOfPapers;
    }

    public Printer(int numOfPapers){
        this.numOfPapers = numOfPapers;
    }

    void print(int amount){
        if (duplex){
            if (amount % 2 != 0) amount = (amount / 2) + 1;
            if (numOfPapers - amount >= 0){
                System.out.println("양면으로 " + amount + "장 출력했습니다. 현재 " + (numOfPapers = numOfPapers - amount) + "장 남아있습니다.");
            } else if (numOfPapers - amount < 0 && numOfPapers > 0) {
                System.out.println("단면으로 모두 출력하려면 용지가 " + (amount - numOfPapers) + "매 부족합니다. " + (numOfPapers) + "장만 출력합니다.");
                numOfPapers = 0;
            } else {
                System.out.println("용지가 없습니다.");
            }
        }
        else {
            if (numOfPapers - amount >= 0){
                System.out.println("단면으로 " + amount + "장 출력했습니다. 현재 " + (numOfPapers = numOfPapers - amount) + "장 남아있습니다.");
            } else if (numOfPapers - amount < 0 && numOfPapers > 0) {
                System.out.println("단면으로 모두 출력하려면 용지가 " + (amount - numOfPapers) + "매 부족합니다. " + (numOfPapers) + "장만 출력합니다.");
                numOfPapers = 0;
            } else {
                System.out.println("용지가 없습니다.");
            }
        }
    }

    public boolean getDuplex() {
        return duplex;
    }
    public void setDuplex(boolean duplex){
        this.duplex = duplex;
    }
}

public class PrinterTest{
    public static void main(String[] args) {
        Printer p = new Printer(20, true);
        p.print(25);
        p.setDuplex(false);
        p.print(10);
    }
}
