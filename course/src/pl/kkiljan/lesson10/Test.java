package pl.kkiljan.lesson10;

/*
Napisz program, który pobierze od użytkownika liczbę i wyświetli jej pierwiastek.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        count();
    }


    private static void count() {
        int number = getNumberFromUser();
        double sqrt = java.lang.Math.sqrt((double) number);
        System.out.printf("Pierwiastek z podanej liczby wynosi %.4f",sqrt);


    }

    private static int getNumberFromUser() {
        System.out.println("Podaj liczbę całkowitą a ja obliczę jej pierwiastek kwadratowy: \n");
        Scanner in = new Scanner(System.in);
        int var = 0;
        while (true) {
            try {
                var = in.nextInt();
                if (var < 0) {
                    throw new IllegalArgumentException("Nie można policzyć pierwiastka z lczby ujemnej!");
                }
                break;

            }

            catch (InputMismatchException e) {
                System.out.println("Podaj liczbę! W dodatku całkowitą. Jak mam policzyć pierwiastek z tego czegoś? Jeszcze raz...");
                in.next();
            }
        }

        return var;

    }


}
