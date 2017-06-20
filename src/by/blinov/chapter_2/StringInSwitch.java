package by.blinov.chapter_2;

import java.util.Scanner;

public class StringInSwitch {
    public static int defineLevel(String role) {
        int level = 0;
        switch (role) {
            case "guest":
                level = 1;
                break;
            case "client":
                level = 2;
                break;
            case "moderator":
                level = 3;
                break;
            case "admin":
                level = 4;
            default: throw new IllegalArgumentException();
        }
        return level;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String persona = in.nextLine();
        int s= defineLevel(persona);
        System.out.println(s);
    }
}
