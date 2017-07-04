package by.blinov.chapter_4.examples.abstract_1;

public class CreditCardAction extends AbstractCardAction {
    @Override
    public void doPayment(double amountPayment){
        System.out.println("complete from credit card!");
    }

}
