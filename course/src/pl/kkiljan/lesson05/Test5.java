package pl.kkiljan.lesson05;

public class Test5 {


    public int sum(int[] tab) {
        int counter = 0;

        for (int  e : tab) {
            counter += e;
        }

        return counter;


    }


    public static void main(String[] args) {

        int[] tab = new int[]{0, 1, 2, 3, 4, 5, 1349, 5789789, 13497, 9};

        Test5 test5 = new Test5();
        System.out.println(test5.sum(tab));

    }
}
