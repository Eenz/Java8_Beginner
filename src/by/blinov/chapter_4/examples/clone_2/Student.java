package by.blinov.chapter_4.examples.clone_2;

import java.util.Vector;

public class Student implements Cloneable {
    private int id= 7;
    private String name;
    private int age;
    private Vector<Byte> v = new Vector<Byte>();

    public Vector<Byte> getV() {
        return v;
    }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setV(Vector<Byte> v) {
        this.v = v;
    }

    public int getAge() {

        return age;
    }

    public Student clone(){
        Student copy = null;
        try{
            copy = (Student)super.clone();
            copy.v = (Vector<Byte>)v.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return copy;
    }
}
