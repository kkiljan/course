package pl.kkiljan.lesson05;

/*
Napisz pętlę for, która wypisze na ekranie wszystkie liczby nieparzyste od -10 do 40.
 */

public class Test3 {
    public static void main(String[] args) {
        for (int i = -10; i < 40; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
