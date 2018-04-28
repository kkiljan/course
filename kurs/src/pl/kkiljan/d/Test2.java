package pl.kkiljan.d;

public class Test2 {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        numbers[0] = 91;
        numbers[1] = -25555;
        numbers[2] = 3;
        Test2 test2 = new Test2();
        System.out.println(test2.maxTriArray(numbers));


    }

    public int maxTriArray(int[] numbers) {
        int counter = numbers[0];

        for (int e : numbers) {
            if (e > counter) counter = e;
        }
        return counter;


    }


}
