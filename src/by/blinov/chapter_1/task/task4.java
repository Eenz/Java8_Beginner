package by.blinov.chapter_1.task;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        String parol = "Trololo1";
        Scanner in = new Scanner(System.in);
        System.out.print("Vvedite parol: ");
        String x = in.nextLine();
        if (x.equals(parol)) {
            System.out.println("Parol prinyat");
        } else {
            System.out.println("Parol nevernij");
        }
    }
}
