package by.blinov.chapter_1;

public class Example12 {
    public static void main(String[] args) {
        String s1, s2;
        s1 = "Java";
        s2 = s1;
        System.out.println("Сравнение ссылок " + (s1 == s1));

        s2 = new String("Java");
        System.out.println("Сравнение ссылок " + (s1 == s2));
        System.out.println("Сравнение значений " + s1.equals(s2));

    }
}
