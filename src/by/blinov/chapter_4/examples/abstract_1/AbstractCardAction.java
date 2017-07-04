package by.blinov.chapter_4.examples.abstract_1;

public abstract class AbstractCardAction {
    private int id;
    public AbstractCardAction(){
    }
    public boolean checkLimit(){
        return true;
    }
    public abstract void doPayment(double amountPayment);
}
