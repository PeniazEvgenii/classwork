package INPUTOUTPUT.taskInpOut;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task_input4 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("Classwork","src","INPUTOUTPUT","taskInpOut","Task3_INput.java");
        System.out.println(path.toFile().exists());
        Path pathNew = Path.of("Classwork","src","INPUTOUTPUT","taskInpOut","Task3_INput2.java");
       // Files.createFile(pathNew);

        String s = Files.readString(path);
        s = s.replace("public", "private");

        Files.writeString(pathNew, s);
    }
}
