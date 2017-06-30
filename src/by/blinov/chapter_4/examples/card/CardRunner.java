package by.blinov.chapter_4.examples.card;

public class CardRunner {
    public static void main(String[] args) {
        CardAction dc1 = new CardAction();
        CardAction dc2 = new CreditCardAction();
        CreditCardAction cc = new CreditCardAction();
        dc1.doPayment(15.5);
        dc2.doPayment(21.5);
        cc.doPayment(7.0);
        cc.checkCreditLimits();
    }
}
