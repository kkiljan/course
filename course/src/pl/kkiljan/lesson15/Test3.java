package pl.kkiljan.lesson15;

/*
Napisz program, który poprosi użytkownika nazwę pliku wyjściowego oraz o podanie swojej daty urodzenia (osobno dzień, miesiąc i rok) a następnie zapisze te dane jako trzy osobne liczby binarnie.
 */

import java.util.ArrayList;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {

        Test3 test3 = new Test3();
        String path = GetStringFromUser.getStringFromUser("Podaj ścieżkę pliku do którego chcesz zapisać dane");


        List<Integer> list = new ArrayList<>();
        test3.addElementsToList(list);
        WriteToTextFileBinary.write(path,list);


    }


    private void addElementsToList(List<Integer> list) {
        String out;


        out = GetStringFromUser.getStringFromUser("Podaj rok urodzenia (YYYY)");
        list.add(Integer.parseInt(out));
        out = GetStringFromUser.getStringFromUser("Podaj miesiąc urodzenia (MM)");
        list.add(Integer.parseInt(out));
        out = GetStringFromUser.getStringFromUser("Podaj dzień urodzenia (DD)");
        list.add(Integer.parseInt(out));

    }


}
