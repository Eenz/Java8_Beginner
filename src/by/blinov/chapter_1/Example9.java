package by.blinov.chapter_1;

public class Example9 {
    private double diametr;
    private double weight;
    public double getDiametr(){
        return diametr;
    }
    public void setDiametr(double value){
        if(value > 0){
            diametr = value;
        }else {
            System.out.println("Отрицательный диаметр!");
        }
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double value) {
        weight = value;
    }
}
