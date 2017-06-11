package by.blinov.chapter_1.task;
import java.util.*;
import java.text.*;

public class task6 {
    public static void main(String[] args) {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        System.out.println("Titkov Maxim Alexandrovich, 10.05.5017 12:36:03, " + formatForDateNow.format(dateNow));
    }
}
