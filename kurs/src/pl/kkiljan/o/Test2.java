package pl.kkiljan.o;

import java.util.ArrayList;
import java.util.List;

public class Test2 {


    public static void main(String[] args) {



        String path = GetStringFromUser.getStringFromUser("Podaj ścieżkę pliku z którego chcesz czytać");


        List<String> list = new ArrayList<>();
        list = ReadFromTextFile.read(path);
        System.out.println("W przeczytanym pliku znajdowało się " + list.size() + " linii.");

        for (String e : list) {
            System.out.println(e);
        }



    }




}
