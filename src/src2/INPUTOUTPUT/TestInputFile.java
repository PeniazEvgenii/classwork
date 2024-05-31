package INPUTOUTPUT;

import java.io.*;
import java.nio.file.Path;

public class TestInputFile {
    public static void main(String[] args) throws IOException {
       // Path path = Path.of("classwork", "resourses","war.txt");
        Path path = Path.of("classwork\\resourses\\war.txt");
        File file = path.toFile();
        System.out.println(file.exists());

        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] bytes = new byte[inputStream.available()];

            byte current;
            int count=0;

            while ((current = (byte) inputStream.read()) != -1) {
                bytes[count++] = current;

                BufferedReader bf = new BufferedReader(new FileReader(file));

                String line = "";
                while ((line = bf.readLine()) != null){
                    System.out.println(line);
                }
            }


    }
}}
