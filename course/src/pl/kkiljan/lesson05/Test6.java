package pl.kkiljan.lesson05;

/*
Przerób funkcję z zadania piątego tak, żeby metoda przymowała tablicę dwuwymiarową typu int[][].
 */

public class Test6 {


    public int sum(int[][] tab) {
        int counter = 0;

        for (int[] e : tab) {
            for (int i : e) {
                counter += i;
            }


        }

        return counter;


    }


    public static void main(String[] args) {

        int[][] tab = new int[][]{{0, 1, 2}, {3, 4, 5}, {1349, 5789789, 13497}};

        Test6 test6 = new Test6();
        System.out.println(test6.sum(tab));


    }
}
