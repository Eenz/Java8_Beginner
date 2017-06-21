package by.blinov.chapter_2.task_A;

public class Task1 {
    private static int[][] array;

    void getArr(int[][] arr, int lenghtArr) {
        array = new int[lenghtArr][lenghtArr];
        array = arr;
    }

    public static void shortAndLongNum() {
        chekLenght();
        maxLenghtNum();
        minLenghtNum();
        Task2 tk2 = new Task2();
        tk2.getArr(array, array.length);
    }

    private static void chekLenght() {//запись в array[1][i] длинны чисел

        for (int i = 0; i < array.length; i++) {
            if (array[0][i] / 100 != 0) {
                array[1][i] = 3;
            } else if (array[0][i] / 10 != 0) {
                array[1][i] = 2;
            } else {
                array[1][i] = 1;
            }
        }
    }

    static boolean chek() {//проверяем, все ли числа одинаковой длинны
        int z = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[1][0] == array[1][i]) {
                z++;
            }
        }
        if (z == array.length) {
            System.out.println("all nubers are equal long ");
            return false;
        } else {
            return true;
        }
    }

    static int maxLenghtNum() {
        int tmpmn = array[0][0];// max num
        int tmpml = array[1][0];// lenght max num
        if (chek()) {

            for (int i = 1; i < array.length; i++) {
                if (tmpml < array[1][i]) {
                    tmpmn = array[0][i];
                    tmpml = array[1][i];
                }
            }
            System.out.println("Max long num: " + tmpmn + ", his lenght: " + tmpml);
        }
        return tmpml;
    }

    static int minLenghtNum() {
        int tmpmn = array[0][0];// min num
        int tmpml = array[1][0];// lenght min num
        if (chek()) {
            for (int i = 1; i < array.length; i++) {
                if (tmpml > array[1][i]) {
                    tmpmn = array[0][i];
                    tmpml = array[1][i];
                }
            }
            System.out.println("Min long num: " + tmpmn + ", his lenght: " + tmpml);

        }
        return tmpml;
    }
}
