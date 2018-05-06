package pl.kkiljan.lesson12;

/*
Napisz program pobierający od użytkownika dwie liczby całkowite. Wyświetl wynik ich dzielenia wraz z częścią ułamkową.
 */

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Podaj dwie liczby całkowite (po każdej Enter)\n");
        Scanner in = new Scanner(System.in);
        int var1 = in.nextInt();
        int var2 = in.nextInt();

        System.out.println("wynik dzielenia dwóch liczb całkowitych w postaci zmiennoprzecinkowej: " + (double)var1/var2);


    }

}
