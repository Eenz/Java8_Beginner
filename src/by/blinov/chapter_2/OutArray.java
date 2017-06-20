package by.blinov.chapter_2;

public class OutArray {
    public static void outArray(){
        int[] arr = {1, 3, 5};
        for (int elem : arr){
            System.out.printf("%d", elem);
        }
    }

    public static void main(String[] args) {
        outArray();
    }
}
