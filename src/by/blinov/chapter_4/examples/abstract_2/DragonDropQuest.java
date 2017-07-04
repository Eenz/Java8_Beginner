package by.blinov.chapter_4.examples.abstract_2;

public class DragonDropQuest extends AbstractQuest {
    @Override
    public boolean check(Answer ans){
        System.out.println("Drag'n'Drop quest");
        return true;
    }
}
