import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.stream.Collectors;

import static java.nio.file.StandardOpenOption.*;

public class ProstoIOoperations {
    public static void main(String[] args) {
        File file = new File("Classwork/resourses/War and peace.txt");
        File file2 = new File("Classwork/resourses/War and peace2.txt");


        try {
            String s = Files.readString(file.toPath());
            System.out.println(s);
            Files.writeString(file2.toPath(), s, CREATE);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
