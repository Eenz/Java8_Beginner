package by.blinov.chapter_4.examples.abstract_2;

public class QuestFactiry {
    public static AbstractQuest getQuestFromFactory(int mode){
        switch (mode){
            case 0 : return new DragonDropQuest();
            case 1 : return new SingleChoiceQuest();
            default: throw new IllegalArgumentException("illegal mode");
        }
    }
}
