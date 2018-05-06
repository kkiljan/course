package pl.kkiljan.lesson07;
/*
Napisz dwie klasy implementujące interfejs Computation. Niech jedna z implementacji przeprowadza operację dodawania, druga mnożenia
 */

public class Multiplication implements Computation {
    @Override
    public double compute(double arg1, double arg2) {
        return arg1*arg2;
    }
}
