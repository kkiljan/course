package pl.kkiljan.o;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToTextFile {

    public static void write(String path, List<String> data) {

//Ścieżka jest podawana przez użytkownika, jednak do testów jest to niepotrzebne
        path = "E:\\autoboxing.txt";

        FileWriter fileWriter = null;
        try {
            try {
                fileWriter = new FileWriter(path);

                for (String e : data) {

                    fileWriter.write(e);
                    fileWriter.write(System.lineSeparator());

                }
            }

            finally {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            }
        }
        catch (IOException e)

        {
            e.printStackTrace();
        }
    }
}
