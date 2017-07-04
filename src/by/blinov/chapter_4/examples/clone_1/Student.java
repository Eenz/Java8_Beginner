package by.blinov.chapter_4.examples.clone_1;

public class Student  implements Cloneable {
    private int id = 71;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
