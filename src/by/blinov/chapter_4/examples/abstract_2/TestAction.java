package by.blinov.chapter_4.examples.abstract_2;

import java.util.Random;

public class TestAction {
    public AbstractQuest[] generateTest(final int NUMBER_QUESTS, int maxMode){
        AbstractQuest[] test = new AbstractQuest[NUMBER_QUESTS];
        for (int i = 0; i < test.length; i++) {
            int mode = new Random().nextInt(maxMode);
            test[i] = QuestFactiry.getQuestFromFactory(mode);
        }
        return test;
    }
    public int checkTest (AbstractQuest[] test){
        int counter = 0;
        for (AbstractQuest s : test){
            counter = s.check(new Answer())? ++counter : counter;
        }
        return counter;
    }
}
