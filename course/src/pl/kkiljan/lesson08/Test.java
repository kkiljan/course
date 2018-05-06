package pl.kkiljan.lesson08;

/*
Narysuj choinkę w konsoli
 */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        tree();

    }

    public static int numberOfLines() {
        System.out.println("Rysujemy choinkę, ile ma mieć poziomów?");
        Scanner inputScanner = new Scanner(System.in);
        return inputScanner.nextInt();

    }

    public static void tree (){
        int lines = Test.numberOfLines();
        char treeSymbol = '*';
        StringBuilder tree = new StringBuilder();
        int k =1;
        for (int i = lines; i > 0; i--) {
            for (int j = (i-1) ; j > 0 ; j--) {
                tree.append(" ");
            }

            for (int j = 2*k-1; j > 0 ; j--) {
                tree.append(treeSymbol);
            }
            k++;
            tree.append(System.lineSeparator());
        }
        String chrismasTree = tree.toString();
        System.out.println(chrismasTree);
    }


}
