package by.blinov.chapter_1;

import by.schildt.chapter_1.Example2;

class Example1 {
    void printSlogan() {
    System.out.println("Enebling the Informations Age");
    }

    public static void main(String[] args) {
        printSlogan1("hello");
        Example1 l1 = new Example1();
        l1.printSlogan();
        Example2 l2 = new Example2();
        Example2 l3 = new Example2();

    }
    static void printSlogan1(String x) {
        System.out.println(x);
    }
}
