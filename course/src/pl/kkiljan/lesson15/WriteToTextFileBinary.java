package pl.kkiljan.lesson15;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class WriteToTextFileBinary {
    public static void write(String path, List<Integer> data) {

//Ścieżka jest podawana przez użytkownika, jednak do testów jest to niepotrzebne
        path = "E:\\autoboxing.txt";

        DataOutputStream outputStream = null;
        try {
            try {
                outputStream = new DataOutputStream(new FileOutputStream(path));
                for (Integer e : data) {

                    outputStream.writeInt(e);

                }
            }

            finally {
                if (outputStream != null) {
                    outputStream.close();
                }
            }
        }
        catch (IOException e)

        {
            e.printStackTrace();
        }
    }
}
