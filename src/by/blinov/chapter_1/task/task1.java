package by.blinov.chapter_1.task;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        System.out.print("Vvedite vashe imya: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello, " + name);
    }
}
