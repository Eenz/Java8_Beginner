package by.blinov.chapter_4.examples.dumb;

public class Dumber extends Dumb {
    int id = 9;

    Dumber() {
        System.out.println("конструктор класса Dumber");
    id = this.getId();
        System.out.println(" id=" + id);
    }
    @Override
    int getId(){
        System.out.println("getId() класса Dumber ");
        return id;
    }

}
