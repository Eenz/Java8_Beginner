package by.blinov.chapter_4.examples.abstract_2;

public class TestRunner {
    public static void main(String[] args) {
        TestAction bt = new TestAction();
        AbstractQuest[] test = bt.generateTest(60,2);
        bt.checkTest(test);
    }
}
