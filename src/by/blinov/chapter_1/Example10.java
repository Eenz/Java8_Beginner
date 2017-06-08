package by.blinov.chapter_1;
import by.blinov.chapter_1.Example9;
public class Example10 {
    public void campareDiametr(Example9 first, Example9 second){
        double delta = first.getDiametr() - second.getDiametr();
        if (delta > 0) {
            System.out.println("Первая монета больше второй на " + delta);
        }else if (delta == 0){
            System.out.println("Монеты имеют одинаковый диаметр");
        } else{
            System.out.println("Вторая монета больше первой на " + delta);
        }
    }
}

