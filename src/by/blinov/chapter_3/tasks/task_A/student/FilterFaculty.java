package by.blinov.chapter_3.tasks.task_A.student;

import by.blinov.chapter_3.tasks.task_A.student.CheckDataInDatabase;

public class FilterFaculty {
    public void filterFaculty(String faculty) {
        CheckDataInDatabase check = new CheckDataInDatabase();
        if (check.checkFaculty(faculty)) {
            System.out.println("На факультете " + faculty + ":");
            Student st = new Student();
            int counter = 0;
            for (int i = 0; i < st.getLenghtArray(); i++) {
                if (st.getFaculty(i) == faculty) {
                    st.printDefineData(i);
                    counter++;
                }
            }
        } else {
            System.out.println("Факультета " + faculty + " не существует");
        }
    }
}
