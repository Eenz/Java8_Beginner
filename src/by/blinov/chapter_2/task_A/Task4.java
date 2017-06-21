package by.blinov.chapter_2.task_A;

public class Task4 {
    private static int[][] array;

    void getArr(int[][] arr, int lenghtArr) {
        array = new int[lenghtArr][lenghtArr];
        array = arr;
    }

    static void outNumWhithMinDeferenceDigits() {
        int tmp = 0;// quality of deference digits
        int tmpn = 0; //number WhithMinDeferenceDigits
        for (int i = 0; i < array.length; i++) {
            if (tmp < numOfDeferenceDigits(array[0][i])) {
                tmp = numOfDeferenceDigits(array[0][i]);
                tmpn = array[0][i];
            }
        }
        System.out.println("NumWhithMinDeferenceDigits: " + tmpn + ", quality of diference digits: " + tmp);
        Task5 tk5 = new Task5();
        tk5.getArr(array, array.length);
    }

    private static int numOfDeferenceDigits(int num) {
        int i = 1;//quantity deference digits
        int first = num / 100;
        int third = num % 10;
        int second = ((num - third) % 100) / 10;
        if (first == second && second == third) {
            i = 3;
        } else if (first == second || first == third || second == third) {
            i = 2;
        }
        return i;
    }
}
