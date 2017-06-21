package by.blinov.chapter_2.task_C;


import by.blinov.chapter_2.task_C.Task1;
import java.util.Scanner;

public class Task {
    public static int[][] arr;

    private static int enterInt() {
        System.out.print("Enter some number: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        return x;
    }

    private static void fillingArr(int x) {
        arr = new int[x][x];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) ((Math.random() * 200) - 100);
            }
        }
    }

    private static void outArr() {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%5d", arr[i][j], " ");
            }
            System.out.println();
        }

    }

    private static void sortArray(){
        Task1 tk1= new Task1();
        tk1.getArr(arr,arr.length);
        tk1.sortArr();
    }

    public static void main(String[] args) {
        fillingArr(enterInt());
        outArr();
        System.out.println();
        sortArray();
        outArr();
    }
}
