package by.blinov.chapter_2.task_A;

public class Task3 {
    private static int[][] array;

    void getArr(int[][] arr, int lenghtArr) {
        array = new int[lenghtArr][lenghtArr];
        array = arr;
    }

    static void outNumGreaterThenAverageNum(int aver) {
        if (aver != 0) {
            System.out.println("Num Greater Then Average Num: ");
            for (int i = 0; i < array.length; i++) {
                if (aver < array[1][i]) {
                    System.out.println(i + " Num-" + array[0][i] + " Lengh- " + array[1][i]);
                }
            }
        }
        Task4 tk4 = new Task4();
        tk4.getArr(array, array.length);
    }

}
