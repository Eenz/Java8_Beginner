package by.blinov.chapter_1;
import by.blinov.chapter_1.Example9;
import by.blinov.chapter_1.Example9;
public class Runner {
    public static void main(String[] args) {
        Example9 ob1 = new Example9();
        ob1.setDiametr(-0.11);
        ob1.setDiametr(0.12);
        Example9 ob2 = new Example9();
        ob2.setDiametr(0.21);
        ob2.setWeight(170);
        Example10 ca = new Example10();
        ca.campareDiametr(ob1,ob2);
    }
}
