package by.blinov.chapter_2.task_B;

import by.blinov.chapter_2.task_B.Task2;
import by.blinov.chapter_2.task_B.Task4;
import java.util.Scanner;

public class Task {
    private static int inK() {
        System.out.println("Enter K:");
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        return k;
    }

    public static void main(String[] args) {
        Task2 tk2 = new Task2();
        tk2.outMatrixOfK(inK());
        Task4 tk4 = new Task4();
        System.out.println(tk4.outMonth(inK()));

    }
}