package pl.kkiljan.lesson07;

public class Addition implements Computation {
    @Override
    public double compute(double arg1, double arg2) {
        return arg1+arg2;
    }
}
