package by.blinov.chapter_2.task_C;

public class Task1 {

    /*
    Упорядочить строки (столбцы) матрицы в порядке возрастания значений
    элементов k-го столбца (строки).
     */

    private static int[][] arr;

    void getArr(int[][] array, int arrLenght) {
        arr = new int[arrLenght][arrLenght];
        arr = array;
    }

    static int[][] returnArr() {
        return arr;
    }

    void sortArr() {
        for (int i = 0; i < arr.length; i++) {
            sortInLine();
            sortInColumn();
        }
        returnArr();
    }

    private static void sortInLine() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i][j] > arr[i][j + 1]) {
                    int tmp = arr[i][j + 1];
                    arr[i][j + 1] = arr[i][j];
                    arr[i][j] = tmp;
                }
            }
        }
    }

    private static void sortInColumn() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j][i] > arr[j][i + 1]) {
                    int tmp = arr[j][i + 1];
                    arr[j][i + 1] = arr[j][i];
                    arr[j][i] = tmp;
                }
            }
        }
    }
}
