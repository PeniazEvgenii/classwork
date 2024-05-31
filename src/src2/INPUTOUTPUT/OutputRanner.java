package INPUTOUTPUT;

import java.io.*;
import java.nio.file.Path;

public class OutputRanner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("classwork","resourses","output.txt").toFile();
        try (BufferedOutputStream fileOutputStream = new BufferedOutputStream(new FileOutputStream(file,true))) {
            String value  = "Hello World!!!\n";
            fileOutputStream.write(value.getBytes());
            fileOutputStream.write(System.lineSeparator().getBytes());
        }
    }
}
