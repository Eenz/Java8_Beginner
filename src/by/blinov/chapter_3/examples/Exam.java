package by.blinov.chapter_3.examples;

public class Exam <T extends Number> {
    private String name;
    private T mark;
    public Exam(T mark, String name){
        this.name = name;
        this. mark = mark;
    }
    public T getMark(){
        return mark;
    }
    public int roundMark(){
        return Math.round(mark.byteValue());
    }
    public boolean equalsToMark(Exam<?> ob){
        return roundMark() == ob.roundMark();
    }
}
