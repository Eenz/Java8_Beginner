package by.blinov.chapter_2;

public class IntToString {
    public static void main(String[] args) {
        int value = 71;
        
            String arg1 = Integer.toString(value); // good method
            String arg2 = String.valueOf(value);    // good method
            String arg3 = "" + value;   //bad method
            System.out.println("1- " + arg1 + " 2- " +arg2 + " 3- " + arg3);

    }
}
