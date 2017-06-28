package by.blinov.chapter_3.tasks.task_A.student;
/*
Создать классы, спецификации которых приведены ниже. Определить кон-
структоры и методы setТип(), getТип(), toString(). Определить дополнительно
методы в классе, создающем массив объектов. Задать критерий выбора данных
и вывести эти данные на консоль. В каждом классе, обладающем информацией,
должно быть объявлено несколько конструкторов.
1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
Факультет, Курс, Группа.
Создать массив объектов. Вывести:
a) список студентов заданного факультета;
b) списки студентов для каждого факультета и курса;
c) список студентов, родившихся после заданного года;
d) список учебной группы.
+ список учащихся в алфавитном порядке
 */

import by.blinov.chapter_3.tasks.task_A.student.Student;
import by.blinov.chapter_3.tasks.task_A.student.FilterFaculty;

public class Runner {
    public static void main(String[] args) {
        Student st = new Student();

        FilterFaculty fil = new FilterFaculty();
        fil.filterFaculty("E");
        System.out.println();

        FilterByYear filb = new FilterByYear();
        filb.filterByYear(1997);
        System.out.println();

        FilterByFacultyAndGroup fil1 = new FilterByFacultyAndGroup();
        fil1.filterByFacultyAndGroup();
        System.out.println();

        st.printAllData();
        System.out.println();

        SortBySurname sr = new SortBySurname();
        sr.sortArray();
    }
}