package by.blinov.chapter_2.task_C;

public class Task2 {
    private static int[][] arr;

    void getArr(int[][] array, int arrLenght) {
        arr = new int[arrLenght][arrLenght];
        arr = array;
    }

    static int[][] returnArr() {
        return arr;
    }

    void shiftArrToLeft(int k) {
        for (int c = 0; c < k; c++) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1; j++) {
                    int tmp = arr[i][j];
                    arr[i][j] = arr[i][j + 1];
                    arr[i][j + 1] = tmp;
                }
            }
        }
        returnArr();
    }


}
