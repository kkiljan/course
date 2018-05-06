package pl.kkiljan.lesson15;

/*
Napisz program, który pobierze od użytkownika ścieżkę do pliku tekstowego oraz kilka linijek tekstu (dopóki użytkownik nie wprowadzi „-” jako linijki) i zapisze je do pliku tekstowego.
 */

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        Test1 test1 = new Test1();

        String path = GetStringFromUser.getStringFromUser("Podaj ścieżkę pliku do którego chcesz zapisać dane");


        List<String> list = new ArrayList<>();
        test1.addElementsToList(list);
        WriteToTextFile.write(path, list);

    }


    private void addElementsToList(List<String> list) {
        String out;

        while (true) {

            out = GetStringFromUser.getStringFromUser("Podaj linijkę tekstu, \"-\" kończy wprowadzanie.");
            if (out.equals("-")) {
                break;
            }
            list.add(out);


        }
    }

}
