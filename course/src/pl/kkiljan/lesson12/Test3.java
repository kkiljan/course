package pl.kkiljan.lesson12;

/*
Napisz program, który skończy się wyjątkiem spowodowanym błędem podczas boxingu/unboxingu.
 */

public class Test3 {

    public static void main(String[] args) {

        Integer a = null;
        int b = 5;
        b +=a;

    }


}
