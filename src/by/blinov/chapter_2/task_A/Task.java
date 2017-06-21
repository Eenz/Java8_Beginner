package by.blinov.chapter_2.task_A;

import java.util.Scanner;

public class Task {
    private static int[] array;// да, я знаю что тут может быть один массив..
    private static int[][] arrLenghtNum;// но мне пох


    public static void shortAndLongNum() {
        arrLenghtNum = new int[array.length][array.length];
        chekLenght();
        maxLenghtNum();
        minLenghtNum();
    }

    public static void inArray() {
        if (array == null) {
            System.out.println("Enter number of array:");
            Scanner in = new Scanner(System.in);
            int lenghtArray = in.nextInt();
            array = new int[lenghtArray];
            for (int i = 0; i < lenghtArray; i++) {
                array[i] = (int) (Math.random() * 1000);
            }
        }
    }

    private static void chekLenght() {

        for (int i = 0; i < arrLenghtNum.length; i++) {
            arrLenghtNum[0][i] = array[i];
            if (array[i] / 100 != 0) {
                arrLenghtNum[1][i] = 3;

            } else if (array[i] / 10 != 0) {
                arrLenghtNum[1][i] = 2;

            } else {
                arrLenghtNum[1][i] = 1;

            }
        }
    }

    private static int maxLenghtNum() {
        int tmpmn = arrLenghtNum[0][0];// max num
        int tmpml = arrLenghtNum[1][0];// lenght max num
        if (chek()) {

            for (int i = 1; i < arrLenghtNum.length; i++) {
                if (tmpml < arrLenghtNum[1][i]) {
                    tmpmn = arrLenghtNum[0][i];
                    tmpml = arrLenghtNum[1][i];
                }
            }
            System.out.println("Max long num: " + tmpmn + ", his lenght: " + tmpml);
        }
        return tmpml;
    }

    private static int minLenghtNum() {
        int tmpmn = arrLenghtNum[0][0];// min num
        int tmpml = arrLenghtNum[1][0];// lenght min num
        if (chek()) {
            for (int i = 1; i < arrLenghtNum.length; i++) {
                if (tmpml > arrLenghtNum[1][i]) {
                    tmpmn = arrLenghtNum[0][i];
                    tmpml = arrLenghtNum[1][i];
                }
            }
            System.out.println("Min long num: " + tmpmn + ", his lenght: " + tmpml);

        }
        return tmpml;
    }

    private static void outArr() {
        for (int i = 0; i < arrLenghtNum.length; i++) {
            System.out.println(i + " Num-" + arrLenghtNum[0][i] + " Lengh- " + arrLenghtNum[1][i]);

        }
    }

    private static boolean chek() {//проверяем, все ли числа одинаковой длинны
        int z = 1;
        for (int i = 1; i < arrLenghtNum.length; i++) {
            if (arrLenghtNum[1][0] == arrLenghtNum[1][i]) {
                z++;
            }
        }
        if (z == arrLenghtNum.length) {
            System.out.println("all nubers are equal long ");
            return false;
        } else {
            return true;
        }
    }

    private static void sortByLongNum() {
        if (chek()) {
            for (int i = 0; i < arrLenghtNum.length; i++) {
                for (int j = 0; j < arrLenghtNum.length; j++) {
                    if (arrLenghtNum[1][i] > arrLenghtNum[1][j]) {
                        int tmp = arrLenghtNum[1][j];
                        arrLenghtNum[1][j] = arrLenghtNum[1][i];
                        arrLenghtNum[1][i] = tmp;
                        tmp = arrLenghtNum[0][j];
                        arrLenghtNum[0][j] = arrLenghtNum[0][i];
                        arrLenghtNum[0][i] = tmp;
                    }
                }
            }
            outArr();
        }
    }

    private static void outNumGreaterThenAverageNum(int aver) {
        if (aver != 0) {
            System.out.println("Num Greater Then Average Num: ");
            for (int i = 0; i < arrLenghtNum.length; i++) {
                if (aver < arrLenghtNum[1][i]) {
                    System.out.println(i + " Num-" + arrLenghtNum[0][i] + " Lengh- " + arrLenghtNum[1][i]);
                }
            }
        }
    }

    private static int averageValue(int max, int min) {
        int aver = 0;
        if (chek()) {
            aver = (max + min) / 2;
        }
        return aver;
    }

    private static void outNumWhithMinDeferenceDigits() {
        int tmp = 0;// quality of deference digits
        int tmpn = 0; //number WhithMinDeferenceDigits
        for (int i = 0; i < arrLenghtNum.length; i++) {
            if (tmp < numOfDeferenceDigits(arrLenghtNum[0][i])) {
                tmp = numOfDeferenceDigits(arrLenghtNum[0][i]);
                tmpn = arrLenghtNum[0][i];
            }
        }
        System.out.println("NumWhithMinDeferenceDigits: " + tmpn + ", quality of diference digits: " + tmp);
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

    private static int outNumWhithOnlyEvenDigits() {
        arrLenghtNum[0][1] = 6;
        int qualityOfNumOnlyEvenDigits = 0;
        for (int i = 0; i < arrLenghtNum.length; i++) {
            if (thirdNum(arrLenghtNum[0][i]) % 2 == 0) {
                if (secondNum(arrLenghtNum[0][i]) == 0 && secondNum(arrLenghtNum[0][i]) % 2 == 0) {
                    if (firstNum(arrLenghtNum[0][i]) == 0 && firstNum(arrLenghtNum[0][i]) % 2 == 0) {
                        qualityOfNumOnlyEvenDigits++;
                    }
                }
            }
        }
        return qualityOfNumOnlyEvenDigits;
    }

    private static int firstNum(int num) {
        num = num / 100;
        return num;
    }

    private static int secondNum(int num) {
        num = ((num - thirdNum(num)) % 100) / 10;
        return num;
    }

    private static int thirdNum(int num) {
        num = num % 10;
        return num;
    }

    private static int outNumWhithDigitsInAscendingOrders() {
        int tmp = 0;
        for (int i = 0; i < arrLenghtNum.length; i++) {
            if ((firstNum(arrLenghtNum[0][i])) + 1 == secondNum(arrLenghtNum[0][i]) && (secondNum(arrLenghtNum[0][i])) + 1 == thirdNum(arrLenghtNum[0][i])) {
                tmp = arrLenghtNum[0][i];
                break;
            }
        }

        return tmp;
    }

    private static int outNumWhitUniqueDigits() {
        int tmp = 0;
        for (int i = 0; i < arrLenghtNum.length; i++) {
            if (firstNum(arrLenghtNum[0][i]) != secondNum(arrLenghtNum[0][i]) && secondNum(arrLenghtNum[0][i]) != thirdNum(arrLenghtNum[0][i]) && thirdNum(arrLenghtNum[0][i]) != firstNum(arrLenghtNum[0][i])) {
                tmp = arrLenghtNum[0][i];
                break;
            }
        }
        return tmp;
    }

    private static int outSecondNumPalindrome() {
        int tmp = 0;
        int z = 0;
        for (int i = 0; i < arrLenghtNum.length; i++) {
            int x = thirdNum(arrLenghtNum[0][i]) * 100 + secondNum(arrLenghtNum[0][i]) * 10 + firstNum(arrLenghtNum[0][i]);
            if (x == arrLenghtNum[0][i]) {
                tmp = arrLenghtNum[0][i];
                if (z == 1) {
                    break;
                } else {
                    z++;
                }
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        inArray();
        shortAndLongNum();
        sortByLongNum();
        outNumGreaterThenAverageNum(averageValue(maxLenghtNum(), minLenghtNum()));
        outNumWhithMinDeferenceDigits();
        int x = outNumWhithOnlyEvenDigits();
        System.out.println("NumWhithOnlyEvenDigits: " + x);
        x = outNumWhithDigitsInAscendingOrders();
        System.out.println("NumWhithDigitsInAscendingOrders: " + x);
        x = outNumWhitUniqueDigits();
        System.out.println("NumWhitUniqueDigits: " + x);
        x = outSecondNumPalindrome();
        System.out.println("SecondNumPalindrome: " + x);

    }


}


