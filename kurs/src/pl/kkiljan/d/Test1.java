package pl.kkiljan.d;

public class Test1 {
    public static void main(String[] args) {

        int[] numbers = new int[]{112, 999};
        Test1 test1 = new Test1();
        System.out.println(test1.sumBiArray(numbers));

    }

    public int sumBiArray(int[] numbers) {
        return numbers[0] + numbers[1];

    }

}