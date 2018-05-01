package pl.kkiljan.o;

import java.util.ArrayList;
import java.util.List;

public class Test4 {


    public static void main(String[] args) {



        String path = GetStringFromUser.getStringFromUser("Podaj ścieżkę pliku z którego chcesz czytać");


        List<Integer> list = new ArrayList<>();
        list = ReadFromTextFileBinary.read(path);
        System.out.println("W przeczytanym pliku znajdowała się następująca data urodzenia: ");

        for (Integer e : list) {
            System.out.print(e);
            System.out.print(" ");
        }



    }

}
