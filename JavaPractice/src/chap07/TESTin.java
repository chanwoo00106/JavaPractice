package chap07;

interface Pay {
    public void payment();
}

class CardPay implements Pay {
    @Override
    public void payment() {
        System.out.println("카드");
    }
}

class CashPay implements Pay {
    @Override
    public void payment() {
        System.out.println("현금");
    }
}

class PaymentService {
    Pay pay;
    private final String Credit_card = "카드결제";
    private final String Cash = "현금결제";

    public void process(String option){
        if(option.equals(Credit_card)) {
            pay = new CardPay();
        } else if (option.equals(Cash)) {
            pay = new CashPay();
        }
        pay.payment();
    }
}

public class TESTin {
    public static void main(String[] args) {
        PaymentService p = new PaymentService();
        p.process("카드결제");
    }
}
