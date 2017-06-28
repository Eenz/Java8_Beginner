package by.additional_tasks.oop;

public class VoidPolimorphizm {
    public static void main(String[] args) {
        Polimorphizm pl = new Polimorphizm();
        pl.write(1);
        pl.write("Hello");

        PolimorhizmSecond pl2 = new PolimorhizmSecond();
        pl2.write("Hello");
        pl2.write(123);
    }
}
