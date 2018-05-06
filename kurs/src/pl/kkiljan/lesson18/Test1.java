package pl.kkiljan.lesson18;

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
