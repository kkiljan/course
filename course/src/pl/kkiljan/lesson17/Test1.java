package pl.kkiljan.lesson17;

/*
Napisz program, który poprosi użytkownika o wprowadzenie kilku imion, imiona te zapisz w liście a następnie zserializuj ją do pliku. Napisz metodę, która odczyta ten plik i wyświetli zawartość listy na konsoli.
 */

import java.io.*;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {


        List<String> list;
        List<String> list2;
        list = PopulationOfList.populationOfList();
        String path = "E:\\serialization.bin";

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path))) {
            outputStream.writeObject(list);


        }
        catch (IOException e) {
            e.printStackTrace();
        }


        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path))) {

            list2 = (List<String>) inputStream.readObject();
            System.out.println(list2);

        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }


}
