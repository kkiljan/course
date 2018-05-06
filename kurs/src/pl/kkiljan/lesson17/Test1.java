package pl.kkiljan.lesson17;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Test1.addElementsToList(list);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("E:\\NewFile.bin"))) {
            for (String e : list) {
                outputStream.writeObject(e);
            }


        }
        catch (IOException e) {
            e.printStackTrace();
        }

        Test1.deserialization();


    }

    private static void addElementsToList(List<String> list) {
        String out;

        while (true) {

            out = GetStringFromUser.getStringFromUser("Podaj imie, \"-\" kończy wprowadzanie.");
            if (out.equals("-")) {
                break;
            }
            list.add(out);


        }
    }

    private static void deserialization() {

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("E:\\NewFile.bin"))) {
            String name;

            while (true) {
                try {

                    name = (String) inputStream.readObject();
                    if (name == null) {
                        break;
                    }
                    System.out.println(name);
                }
                catch (EOFException e){
                    break;
                }
            }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
