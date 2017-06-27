package by.blinov.chapter_3.tasks.task_A.student;
/*
В данном классе выводится список студентов, родившихся после заданного года;
 */
public class FilterByYear {
    public void filterByYear(long year){
        CheckDataInDatabase check = new CheckDataInDatabase();
        if (check.checkBirthdayYear(year)) {
            System.out.println("Учащихся родившихся после " + year + ":");
            Student st = new Student();
            int counter = 0;
            for (int i = 0; i < st.getLenghtArray(); i++) {
                if (year <= st.getBirthdayYear(i)) {
                    st.printDefineData(i);
                    counter++;
                }
            }
        } else {
            System.out.println("Учащихся родившихся после " + year + " не существует");
        }
    }
}
