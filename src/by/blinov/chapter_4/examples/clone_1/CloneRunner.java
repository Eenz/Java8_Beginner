package by.blinov.chapter_4.examples.clone_1;

import java.lang.management.ClassLoadingMXBean;

public class CloneRunner {
    public static void mutation(Student p) {
        try{
            p = (Student)p.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    p.setId(1000);
        System.out.println("->id = " + p.getId());
    }

    public static void main(String[] args) {
        Student ob = new Student();
        System.out.println("id = " + ob.getId());
        mutation(ob);
        System.out.println("id = " + ob.getId());;
    }
}
