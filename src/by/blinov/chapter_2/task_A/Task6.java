package by.blinov.chapter_2.task_A;

public class Task6 {
    private static int[][] array;

    void getArr(int[][] arr, int lenghtArr) {
        array = new int[lenghtArr][lenghtArr];
        array = arr;
    }

    static int outNumWhithDigitsInAscendingOrders() {
        Task5 tk5 = new Task5();
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            if ((tk5.firstNum(array[0][i])) + 1 == tk5.secondNum(array[0][i]) && (tk5.secondNum(array[0][i])) + 1 == tk5.thirdNum(array[0][i])) {
                tmp = array[0][i];
                break;
            }
        }

        return tmp;
    }

    static int outNumWhitUniqueDigits() {
        Task5 tk5 = new Task5();
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            if (tk5.firstNum(array[0][i]) != tk5.secondNum(array[0][i]) && tk5.secondNum(array[0][i]) != tk5.thirdNum(array[0][i]) && tk5.thirdNum(array[0][i]) != tk5.firstNum(array[0][i])) {
                tmp = array[0][i];
                break;
            }
        }
        return tmp;
    }

    static int outSecondNumPalindrome() {
        Task5 tk5 = new Task5();
        int tmp = 0;
        int z = 0;
        for (int i = 0; i < array.length; i++) {
            int x = tk5.thirdNum(array[0][i]) * 100 + tk5.secondNum(array[0][i]) * 10 + tk5.firstNum(array[0][i]);
            if (x == array[0][i]) {
                tmp = array[0][i];
                if (z == 1) {
                    break;
                } else {
                    z++;
                }
            }
        }
        return tmp;
    }
}
