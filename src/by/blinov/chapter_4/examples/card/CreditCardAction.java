package by.blinov.chapter_4.examples.card;

public class CreditCardAction  extends CardAction{
    public boolean checkCreditLimits(){
        return true;
    }



@Override
    public void doPayment(double amountPayment){
    System.out.println("complete from credit card");
}
}
