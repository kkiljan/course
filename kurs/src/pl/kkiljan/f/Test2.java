package pl.kkiljan.f;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        double[][] marks = new double[3][4];
        Scanner inputScanner = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {

            for (int u = 0; u < 4; u++) {
                System.out.println("Wprowadź ocenę nr. " + u + " z przedmiotu nr. " + i);
                marks[i][u] = inputScanner.nextDouble();

            }
        }

        double sumTab = 0;
        for (double [] e : marks) {
            for (double f :e) {
                sumTab += f;
            }
        }

        System.out.println("Średnia ocen z przedmiotów to " + (sumTab / (marks[0].length + marks[1].length + marks[2].length)));

    }
}
