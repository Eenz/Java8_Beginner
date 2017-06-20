package by.blinov.chapter_2;

public class Compare {
    public static void main(String[] args) {
        int i = 127;
        Integer a = i;
        Integer b = i;
        System.out.println("a==b " + (a == b));//true - распаковка и сравнение значений
        System.out.println("b==i " + (b == i));//true
        System.out.println("a==b" + (a == b));// false (ссылки на разные обьекты)
        System.out.println("equales ->" + a.equals(i)
                + b.equals(i)
                + a.equals(b));// true, true , true

    }
}
