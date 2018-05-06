package pl.kkiljan.lesson17;

/*
Napisz klasę Human, która będzie miała dwa atrybuty name typu String oraz age typu int. Jak należałoby serializować instancje tej klasy aby zawsze poprawnie deserializować wiek (z dokładnością do roku)?
 */

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