package by.blinov.chapter_2;

public class StringToInt {
    public static void main(String[] args) {
        String arg = "71";
        try {
            int value1 = Integer.parseInt(arg);
            int value2 = Integer.valueOf(arg);
            int value3 = Integer.decode(arg);
            int value4 = new Integer(arg);
            System.out.println("1- " + value1 + " 2- " + value2 + " 3- " + value3 + " 4- " + value4);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат числа " + e);
        }

    }
}
