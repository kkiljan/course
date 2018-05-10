package pl.kkiljan.lesson20;


import java.util.Scanner;

public class GetStringFromUser {
    public static String getStringFromUser(String message) {
        System.out.println(message);
        Scanner in = new Scanner(System.in);
        String out;
        out = in.next();
        return out;

    }


}
