package by.blinov.chapter_4.examples.dumb;

public class Dumb extends Object {
    {
        this.id = 6;
    }

    int id;

    Dumb() {
        System.out.println("конструктор класса Dumb ");
        id = this.getId();
        System.out.println(" id=" + id);
    }
    int getId(){
        System.out.println("getId90 класса Dump ");
        return id;
    }
}
