package by.blinov.chapter_2.task_B;

public class Task2 {
    void outMatrixOfK(int k){
        int z = 0;
        for (int i = 0; i < k; i++) {

            for (int j = 0; j < k ; j++) {
                System.out.printf("%4d" , (j+z) , " ");
            }
            System.out.println();
            z++;
        }
    }
}
