package by.blinov.chapter_2.task_A;

public class Task2 {
    private static int[][] array;

    void getArr(int[][] arr, int lenghtArr) {
        array = new int[lenghtArr][lenghtArr];
        array = arr;
    }

    static void sortByLongNum() {
        Task1 tk1 = new Task1();
        Task tk = new Task();
        if (tk1.chek()) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[1][i] > array[1][j]) {
                        int tmp = array[1][j];
                        array[1][j] = array[1][i];
                        array[1][i] = tmp;
                        tmp = array[0][j];
                        array[0][j] = array[0][i];
                        array[0][i] = tmp;
                    }
                }
            }
            tk.outArr();
        }
        Task3 tk3 = new Task3();
        tk3.getArr(array, array.length);
    }
}
