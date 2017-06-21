package by.blinov.chapter_2.task_A;

public class Task5 {
    private static int[][] array;

    void getArr(int[][] arr, int lenghtArr) {
        array = new int[lenghtArr][lenghtArr];
        array = arr;
    }

    static int outNumWhithOnlyEvenDigits() {
        array[0][1] = 6;
        int qualityOfNumOnlyEvenDigits = 0;
        for (int i = 0; i < array.length; i++) {
            if (thirdNum(array[0][i]) % 2 == 0) {
                if (secondNum(array[0][i]) == 0 && secondNum(array[0][i]) % 2 == 0) {
                    if (firstNum(array[0][i]) == 0 && firstNum(array[0][i]) % 2 == 0) {
                        qualityOfNumOnlyEvenDigits++;
                    }
                }
            }
        }
        Task6 tk6 = new Task6();
        tk6.getArr(array,array.length);
        return qualityOfNumOnlyEvenDigits;
    }

    static int firstNum(int num) {
        num = num / 100;
        return num;
    }

    static int secondNum(int num) {
        num = ((num - thirdNum(num)) % 100) / 10;
        return num;
    }

    static int thirdNum(int num) {
        num = num % 10;
        return num;
    }
}
