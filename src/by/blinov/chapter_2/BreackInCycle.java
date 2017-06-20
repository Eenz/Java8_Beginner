package by.blinov.chapter_2;

public class BreackInCycle {
    public static void cycleBreak(int j) {
        OUT:
        while (true) {
            for (; ; ) {
                while (j < 10) {
                    if (j == 0) {
                        break OUT;
                    } else {
                        j++;
                        System.out.printf("%d%n", j);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        cycleBreak(-3);
    }
}
