package PATTERNS.props;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class WorkWithProperties {
    public static void main(String[] args) {
        Properties props = new Properties();
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of("classwork/src/PATTERNS/props/config.properties"))) {
            props.load(bufferedReader);
            props.put("add", "string");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(props.getProperty("database.url"));
        System.out.println(props.getProperty("add"));
    }
}
