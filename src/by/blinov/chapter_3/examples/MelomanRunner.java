package by.blinov.chapter_3.examples;

public class MelomanRunner {
    public static void main(String[] args) {
        MusicStyle ms = MusicStyle.valueOf("Rock".toUpperCase());
        System.out.print(ms);
        switch (ms){
            case JAZZ:
                System.out.println(" is Jazz");
                break;
            case ROCK:
                System.out.println(" is Rock");
                break;
            case BLUES:
                System.out.println(" is Blues");
            break;
            case CLASSIC:
                System.out.println(" is Classic");
                break;
        default:
            System.out.println(" Unknown music style: " + ms);
        }
    }
}