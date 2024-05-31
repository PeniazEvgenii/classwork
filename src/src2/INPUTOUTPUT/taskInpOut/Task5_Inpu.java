package INPUTOUTPUT.taskInpOut;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Task5_Inpu {
    public static void main(String[] args) {
        Path path = Path.of("Classwork","src","INPUTOUTPUT","taskInpOut","Task3_INput.java");
        System.out.println(path.toFile().exists());
        Path pathNew = Path.of("Classwork","src","INPUTOUTPUT","taskInpOut","Task3_INput2.java");

        try(Stream<String> list = Files.lines(path);
            BufferedWriter bf = Files.newBufferedWriter(pathNew, StandardOpenOption.APPEND, StandardOpenOption.CREATE)) {
            list.map(StringBuilder::new)
                    .map(StringBuilder::reverse)
                    .forEach(line -> {
                        try {
                            bf.write(line.toString());
                            bf.newLine();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
