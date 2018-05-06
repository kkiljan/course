package pl.kkiljan.lesson18;

import java.io.*;

public class Test2 {

    public static void main(String[] args) {


        Human human = new Human("Konrad", 26);
        Human human2;
        String path = "E:\\serialization.bin";

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(path))) {
            outputStream.writeObject(human);


        }
        catch (IOException e) {
            e.printStackTrace();
        }


        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(path))) {

            human2 = (Human) inputStream.readObject();
            System.out.println(human2);

        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }




}