package INPUTOUTPUT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;

public class InputStreamRunner {
    public static void main(String[] args) throws IOException {
       // File file2 = new File("C:\\Users\\evg\\IdeaProjects\\JD1\\ClassWork\\resourses\\test.txt");

       // Path path3 = Path.of("C:", "Users","evg", "IdeaProjects", "JD1" , "ClassWork","resourses","test.txt");

        File file = Path.of("ClassWork","resourses","test.txt").toFile();

        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] bytes = new byte[inputStream.available()];
            int counter = 0;
            byte currentByte;
            while ((currentByte = (byte) inputStream.read()) != -1) {
                bytes[counter++] = currentByte;
            }
            String value = new String(bytes);
            System.out.println(value);
            //byte[] bytes = inputStream.readAllBytes();
           // String s = new String(bytes);
           // System.out.println(s);
        }


    }
}

class WarBook{
    public static void main(String[] args) throws IOException {
        Path path = Path.of("classwork","resourses","war.txt");
        File file = path.toFile();
        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] bytes = inputStream.readAllBytes();
            System.out.println(bytes.length);
            String str = new String(bytes);
            System.out.println(str);
        }
    }
}
