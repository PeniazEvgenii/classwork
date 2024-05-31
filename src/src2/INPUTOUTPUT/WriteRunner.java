package INPUTOUTPUT;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.SYNC;

public class WriteRunner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("classwork","resourses","output.txt").toFile();
        Path path = Path.of("classwork","resourses","output.txt");

        Files.write(path, List.of("dfgd"));
       // try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
       try (BufferedWriter bw = Files.newBufferedWriter(path,APPEND)) {

           bw.append("privet");
           bw.newLine();
           bw.append("privet2");
           bw.append(System.lineSeparator());
           bw.append("privet_Kakashka");
           bw.append(System.lineSeparator());

       }

        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
            String s = "";
            while ((s = bf.readLine()) !=null){
                System.out.println(s);

            }
        }

    }
}
