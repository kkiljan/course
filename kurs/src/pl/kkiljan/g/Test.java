package pl.kkiljan.g;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        Computation computation;

        if (test.shouldMultiply()) {
            computation = new Multiplication(); // zaimplementuj brakującą klasę
        }
        else {
            computation = new Addition(); // zaimplementuj brakującą klasę
        }

        double argument1 = test.getArgument();
        double argument2 = test.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        System.out.println("Chcesz (d)odawać czy (m)nożyć? ");
        Scanner inputScanner = new Scanner(System.in);
        char i = inputScanner.next().charAt(0);

        if (i == 'm')
        return true; // tutaj zapytaj użytkownika co chce zrobić (mnożenie czy dodawanie)
        else
        return false;
    }

    private double getArgument() {
        System.out.println("Podaj liczbę: ");
        Scanner inputScanner = new Scanner(System.in);
        double i = inputScanner.nextDouble();

        return i; // tutaj pobierz liczbę od użytkownika
    }

}
