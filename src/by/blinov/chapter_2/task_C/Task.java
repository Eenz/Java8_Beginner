package by.blinov.chapter_2.task_C;

import by.blinov.chapter_2.task_C.Task1;

import java.util.Scanner;

public class Task {
    public static int[][] arr;

    /*
    Вариант C
    Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элемен-
    тов матрицы в интервале значений от -n до n с помощью датчика случайных чи-
    сел.
     */

    private static int enterInt() {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        return x;
    }

    private static void fillingArr(int x) {

        arr = new int[x][x];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) ((Math.random() * (x * 2)) - (x + 1));
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

    /*
    Упорядочить строки (столбцы) матрицы в порядке возрастания значений
    элементов k-го столбца (строки).
     */

    private static void sortArray() {
        Task1 tk1 = new Task1();
        tk1.getArr(arr, arr.length);
        tk1.sortArr();
        outArr();
    }

    /*
    Выполнить циклический сдвиг заданной матрицы на k позиций вправо
    (влево, вверх, вниз).
     */

    static void shiftArr() {
        System.out.print("Enter number to shift array to left: ");
        Task2 tk2 = new Task2();
        tk2.getArr(arr, arr.length);
        tk2.shiftArrToLeft(enterInt());
        outArr();
    }

    public static void main(String[] args) {
        System.out.print("Enter quality of array: ");
        fillingArr(enterInt());
        outArr();
        System.out.println();

        sortArray();

        shiftArr();
    }
}
