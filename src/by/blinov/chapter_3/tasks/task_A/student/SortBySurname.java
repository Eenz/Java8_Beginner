package by.blinov.chapter_3.tasks.task_A.student;

import java.util.Arrays;

/*
сортировка по Фамилии учащегося, с выводом на экран
 */
public class SortBySurname {
    private String[] surname;

    public void sortArray() {
        Student st = new Student();
        surname = st.getSurnameArr();
        Arrays.sort(surname);
        for (int i = 0; i < surname.length; i++) {
            System.out.println(surname[i]);
        }
        printBySurname();
    }

    private void printBySurname() {
        /*
        этот метод выводит в консоль отсортированные данные по фамилии
         */
        Student st = new Student();
        for (int i = 0; i < surname.length; i++) {
            for (int j = 0; j < surname.length; j++) {
                if (surname[i] == st.getSurname(j)) {
                    st.printDefineData(j);
                }
            }
        }
    }

}
