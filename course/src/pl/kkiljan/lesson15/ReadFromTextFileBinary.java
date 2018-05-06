package pl.kkiljan.lesson15;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromTextFileBinary {


    public static List<Integer> read(String path) {

//Ścieżka jest podawana przez użytkownika, jednak do testów jest to niepotrzebne
        path = "E:\\autoboxing.txt";
        List<Integer> list = new ArrayList<>();

        DataInputStream inputStream = null;
        try {
            try {
                inputStream = new DataInputStream(new FileInputStream(path));
                while (true) {
                    try {
                        Integer number = inputStream.readInt();

                       // if (number != null) {
                            list.add(number);
                       // } else {
                        //    break;
                       // }
                    }
                    catch (EOFException e) {
                        break;
                    }
                }
            }

            finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        }
        catch (IOException e)

        {
            e.printStackTrace();
        }
        return list;
    }


}
