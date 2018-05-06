package pl.kkiljan.lesson15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromTextFile {


    public static List<String> read(String path) {

//Ścieżka jest podawana przez użytkownika, jednak do testów jest to niepotrzebne
        //path = "E:\\autoboxing.txt";
        List<String> list = new ArrayList<>();

        BufferedReader fileReader = null;
        try {
            try {
                fileReader = new BufferedReader(new FileReader(path));
                while (true) {
                    String line = fileReader.readLine();
                    if (line != null) {
                        list.add(line);
                    } else {
                        break;
                    }
                }
            }

            finally {
                if (fileReader != null) {
                    fileReader.close();
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
