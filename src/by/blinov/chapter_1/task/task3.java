package by.blinov.chapter_1.task;
import java.util.Scanner;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        int i = 0;
        final Random random = new Random();
        System.out.println("Vvedite kolichestvo chisel: ");
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
        System.out.print("Vivod v stroku: ");
            while (i < x) {
                System.out.print(random.nextInt()+ " ");
                i++;
            }
            System.out.println();
        System.out.println("Vivod v stolbec: ");
            i = 0;
            while (i < x) {
            System.out.println(random.nextInt());
            i++;
            }
    }
}
