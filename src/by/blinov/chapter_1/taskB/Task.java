package by.blinov.chapter_1.taskB;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task {
    static double[] array;

    public static void createArray() {
        if (array == null) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter array lenght: ");
            int size = in.nextInt();
            array = new double[size];
            if (size > 0) {
                for (int i = 0; i < size; i++) {
                    array[i] = (int) ((Math.random() * 2000) - 1000);
                }
            } else {
                System.out.println("Enntered arrey incorrect");
            }
        } else {
            error();
        }
    }


    public static void outEvenNumbers() {
        if (array != null) {
            System.out.print("Even numbers: ");
            int z = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    System.out.print((int) array[i] + " ");
                    z++;
                }
            }
            executionCheck(z);
        } else {
            error();
        }

    }

    public static void outOddNumbers() {
        if (array != null) {
            int z = 0;
            System.out.print("Odd numbers: ");
            for (int i = 0; i < array.length; i++) {

                if (array[i] % 2 != 0) {
                    System.out.print((int) array[i] + " ");
                    z++;
                }
            }
            executionCheck(z);
        } else {
            error();
        }
    }

    public static void maxNumber() {
        if (array != null) {
            int maxNumber = (int) array[0];
            for (int i = 1; i < array.length; i++) {
                if (maxNumber < array[i]) {
                    maxNumber = (int) array[i];
                }
            }
            System.out.println("Max number in array: " + maxNumber);
        } else {
            error();
        }
    }

    public static void minNumber() {
        if (array != null) {
            int minNumber = (int) array[0];
            for (int i = 1; i < array.length; i++) {
                if (minNumber > array[i]) {
                    minNumber = (int) array[i];
                }
            }
            System.out.println("Min number in array: " + minNumber);
        } else {
            error();
        }
    }

    // || - or
    public static void numberEvenThreeOrNine() {
        if (array != null) {
            System.out.print("Numbers three or nine odd: ");
            int z = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 3 == 0 || array[i] % 9 == 0) {
                    System.out.print((int) array[i] + " ");
                    z++;
                }
            }
            executionCheck(z);
        } else {
            error();
        }
    }

    public static void numberEvenFiveAndSeven() {
        if (array != null) {
            System.out.print("Numbers five and seven odd: ");
            int z = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 5 == 0) {
                    if (array[i] % 7 == 0) {
                        System.out.print((int) array[i] + " ");
                        z++;
                    }
                }
            }
            executionCheck(z);

        } else {
            error();
        }
    }

    public static void arraySortByBubbleMethod() {
        if (array != null) {
            System.out.print("Arreys sort by bubble method: ");
            for (int i = array.length - 1; i >= 0; i--) {
                for (int z = 0; z < i; z++) {
                    if (array[z] > array[z + 1]) {
                        double tmp = array[z];
                        array[z] = array[z + 1];
                        array[z + 1] = tmp;
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print((int) array[i] + " ");
            }
            System.out.println();
        } else {
            error();
        }
    }

    public static void threeDiritNumbersWhithoutIdentiicalDigits() {
        if (array != null) {
            int z = 0;
            System.out.print("Three-dirit Numbers Whithout Identiical Digits: ");
            for (int i = 0; i < array.length; i++) {
                int numFirst = (int) (Math.abs((array[i]) / 100));
                if (numFirst != 0) {
                    int numSecond = (int) (Math.abs((array[i]) / 10));
                    int numThird = ((int) (Math.abs(array[i])));
                    numThird -= numSecond * 10;
                    numSecond -= numFirst * 10;
                    if ((numFirst != numSecond) & (numFirst != numThird) & (numSecond != numThird)) {
                        System.out.print(array[i] + " ");
                        z++;
                    }

                }
            }
            executionCheck(z);
        } else {
            error();
        }
    }

    public static void primesNums() {
        if (array != null) {
            int z = 0;
            System.out.print("Primes numbers: ");
            for (int i = 0; i < array.length; i++) {
                if ((((array[i]) / 100) == 0) || (((array[i]) / 10) == 0)) {
                    System.out.print(array[i]);
                    z++;
                }

            }
            executionCheck(z);
        } else {
            error();
        }
    }

    public static void sortAscendingAndDecreasingOrder() {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                for (int z = i + 1; z < array.length; z++) {
                    if (array[i] > array[z]) {
                        double tmp = array[i];
                        array[i] = array[z];
                        array[z] = tmp;
                    }
                }
            }
            System.out.println("Sort ascending: " + Arrays.toString(array));
            for (int i = 0; i < array.length; i++) {
                for (int z = i + 1; z < array.length; z++) {
                    if (array[i] < array[z]) {
                        double tmp = array[i];
                        array[i] = array[z];
                        array[z] = tmp;
                    }
                }
            }
            System.out.println("Sort decreasing order: " + Arrays.toString(array));
        } else {
            error();
        }
    }

    public static void sortByFrequencyOfOccurenceOfNumbers() {
        if (array != null) {
            int x = 0;
            for (int i = 0; i < array.length; i++) {
                for (int z = i + 1; z < array.length; z++) {
                    if (array[i] == array[z]) {
                        double tmp = array[x];
                        array[x] = array[i];
                        array[i] = tmp;
                        x++;
                        tmp = array[x];
                        array[x] = array[z];
                        array[z] = tmp;
                        x++;
                    }
                }
            }
            System.out.println("sort By Frequency Of Occurence Of Numbers: " + Arrays.toString(array));
        } else {
            error();
        }
    }

    public static void luckNum() {
        if (array != null) {
            System.out.print("Luck Nums: ");
            int quantityNum = (int) ((Math.random() * (array.length - 1) + 1));
            for (int i = 0; i < quantityNum; i++) {
                System.out.print(array[(int) (Math.random() * array.length)] + " ");
            }
            System.out.println();
        } else {
            error();
        }
    }

    public static void numFibonacchi() {
        if (array != null) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the Fibonacci number(form 1 to 20): ");
            int num = in.nextInt();
            if (num != 0 & num <= 20) {
                int tmp1 = 1;
                int tmp2 = 1;
                System.out.print("Fibonacchi numbers: 1 1 ");
                for (int i = 0; i < num - 2; i++) {
                    int tmp = tmp1 + tmp2 ;
                    tmp1 = tmp2;
                    tmp2 = tmp;
                    System.out.print(tmp + " ");
                }
            }else{
                System.out.println(" ERROR: Entered number does not enter into the gap! ");
            }
        } else {
            error();
        }
    }

    private static void executionCheck(int z) {
        if (z == 0) {
            System.out.println("There are no such numbers");
        } else {
            System.out.println();
        }
    }

    private static void error() {
        System.out.println(" ERROR: Array is null ");
    }

    @Override
    public String toString() {
        if (array != null) {
            Arrays.toString(array);
        } else {
            return "Array is null";
        }
        return "Hsajk " + array.length;
    }

    public static void main(String[] args) {
        createArray();
        System.out.println("Entered array: " + Arrays.toString(array));
        outEvenNumbers();
        outOddNumbers();
        maxNumber();
        minNumber();
        numberEvenThreeOrNine();
        numberEvenFiveAndSeven();
        arraySortByBubbleMethod();
        threeDiritNumbersWhithoutIdentiicalDigits();
        primesNums();
        sortAscendingAndDecreasingOrder();
        sortByFrequencyOfOccurenceOfNumbers();
        luckNum();
        numFibonacchi();
    }
}