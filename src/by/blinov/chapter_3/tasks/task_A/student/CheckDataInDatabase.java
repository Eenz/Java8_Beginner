package by.blinov.chapter_3.tasks.task_A.student;

public class CheckDataInDatabase {
    public boolean checkFaculty(String data) {
        Student st = new Student();
        int counter = 0;
        for (int i = 0; i < st.getLenghtArray(); i++) {
            if (data == st.getFaculty(i)) {
                counter++;
            }
        }
        if (counter == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkBirthdayYear(long year) {
        Student st = new Student();
        int counter = 0;
        for (int i = 0; i < st.getLenghtArray(); i++) {
            if (year == st.getBirthdayYear(i)) {
                counter++;
            }
        }
        if (counter == 0) {
            return false;
        } else {
            return true;
        }
    }
}
