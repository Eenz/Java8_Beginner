package by.blinov.chapter_4.examples.abstract_2;

public class SingleChoiceQuest extends AbstractQuest {
    @Override
    public boolean check(Answer ans){
        System.out.println("Single choice quest");
        return true;
    }
}
