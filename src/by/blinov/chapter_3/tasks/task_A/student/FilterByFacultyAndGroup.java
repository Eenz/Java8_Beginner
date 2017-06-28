package by.blinov.chapter_3.tasks.task_A.student;

/*
в данном методе идет поиск и вывод списки студентов для каждого факультета и курса;
 */
public class FilterByFacultyAndGroup {
    private String[] tempFaculty;

    public void filterByFacultyAndGroup() {
        Student st = new Student();
        tempFaculty = new String[st.getLenghtArray()];
        for (int i = 0; i < tempFaculty.length; i++) {
            tempFaculty[i] = "null";
        }
        for (int i = 0; i < st.getLenghtArray(); i++) {
            if (checkWhetherTheFaculty(st.getFaculty(i))) {
                for (int j = 0; j < st.getLenghtArray(); j++) {
                    for (int k = 0; k < st.getLenghtArray(); k++) {
                        if (st.getCourse(k) == j && st.getFaculty(i) == st.getFaculty(k)) {
                            st.printDefineData(k);
                        }
                    }
                }
            }

        }
    }

    private boolean checkWhetherTheFaculty(String faculty) {

        int counter = 0;
        for (int i = 0; i < tempFaculty.length; i++) {
            if (faculty == tempFaculty[i]) {
                counter++;
            }
        }

        if (counter == 0) {
            for (int i = 0; i < tempFaculty.length; i++) {
                if (tempFaculty[i] == "null") {
                    tempFaculty[i] = faculty;
                    break;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
