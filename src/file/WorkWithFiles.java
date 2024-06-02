package file;

import java.io.*;
import java.nio.file.Files;

public class WorkWithFiles {
    public static void main(String[] args) {
        String s = File.separator;
        System.out.println(s);
        File file = new File("src/array/Break.java");
        System.out.println(file.exists());
        try {
            BufferedReader reader = new  BufferedReader (new FileReader(file));
            FileWriter writer = new FileWriter(file);
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
