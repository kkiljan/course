package pl.kkiljan.lesson06;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        double[] temperature = new double[7];
        Scanner inputScanner = new Scanner(System.in);

        for (int i = 0; i < temperature.length; i++) {
            System.out.println("Wprowadź 7 temperatur");
            System.out.println("Pomiar nr " + (i+1));
            temperature[i] = inputScanner.nextDouble();

        }

        double sumTab = 0;
        for (double e : temperature) {
            sumTab += e;
        }

        System.out.println("Średnia temperatura wynosi " + (sumTab/temperature.length));

    }

}
