package by.blinov.chapter_4.examples.abstract_1;

public class Runner {
    public static void main(String[] args) {
        AbstractCardAction action;
        action = new CreditCardAction();
        action.doPayment(100);

    }
}
