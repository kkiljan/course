package pl.kkiljan.l;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Podaj jakąś liczbę całkowitą. \n");
    Scanner in = new Scanner(System.in);
    int var = in.nextInt();

        System.out.printf("Wynik mnożenia podanej liczby przez PI w postaci całkowitej %d oraz w postaci zmiennoprzecinkowej %f.",(int)(var * Math.PI),(var * Math.PI));


    }




}
