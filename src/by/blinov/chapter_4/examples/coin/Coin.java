package by.blinov.chapter_4.examples.coin;

public class Coin {
    private double diametr;
    public Coin(double diametr){
        super();
        initDiametr(diametr);

    }
    public final void initDiametr(double value){
        if(value > 0 ){
            diametr = value;
        }else{
            System.out.println("отрицательный диаметр!");
        }
    }
}
