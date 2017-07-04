package by.blinov.chapter_4.examples.abstract_2;

public abstract class AbstractQuest {
    private long id;
    private String questContent;
    public abstract boolean check(Answer ans);
}
