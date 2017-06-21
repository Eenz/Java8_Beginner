package by.blinov.chapter_2.task_A;

import java.util.Scanner;

public class Task {
    private static int[][] array;// но мне пох

    public static void inArray() {
        if (array == null) {
            System.out.println("Enter number of array:");
            Scanner in = new Scanner(System.in);
            int lenghtArray = in.nextInt();
            array = new int[lenghtArray][lenghtArray];
            for (int i = 0; i < lenghtArray; i++) {
                array[0][i] = (int) (Math.random() * 1000);
            }
        }
    }

    static void outArr() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " Num-" + array[0][i] + " Lengh- " + array[1][i]);

        }
    }


    private static int averageValue(int max, int min) {
        Task1 tk1 = new Task1();
        int aver = 0;
        if (tk1.chek()) {
            aver = (max + min) / 2;
        }
        return aver;
    }


    public static void main(String[] args) {
        inArray();
        Task1 tk1 = new Task1();
        tk1.getArr(array, args.length);
        tk1.shortAndLongNum();

        Task2 tk2 = new Task2();
        tk2.sortByLongNum();

        Task3 tk3 = new Task3();
        tk3.outNumGreaterThenAverageNum(averageValue(tk1.maxLenghtNum(), tk1.minLenghtNum()));

        Task4 tk4 = new Task4();
        tk4.outNumWhithMinDeferenceDigits();

        Task5 tk5 = new Task5();
        int x = tk5.outNumWhithOnlyEvenDigits();

        Task6 tk6 = new Task6();
        System.out.println("NumWhithOnlyEvenDigits: " + x);
        x = tk6.outNumWhithDigitsInAscendingOrders();
        System.out.println("NumWhithDigitsInAscendingOrders: " + x);
        x = tk6.outNumWhitUniqueDigits();
        System.out.println("NumWhitUniqueDigits: " + x);
        x = tk6.outSecondNumPalindrome();
        System.out.println("SecondNumPalindrome: " + x);

    }


}


