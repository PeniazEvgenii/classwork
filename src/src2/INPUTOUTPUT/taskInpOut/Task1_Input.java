package INPUTOUTPUT.taskInpOut;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class Task1_Input {
    private static final String VOWEL = "уеыаоэяию";

    public static void main(String[] args) throws IOException {
        Path path = Path.of("ClassWork\\resourses\\test.txt");
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                char first = word.toLowerCase().charAt(0);
                if(VOWEL.indexOf(first) != -1) {
                    word = word.replaceAll("[.,!]","");
                    System.out.println(word);
                }
            }
        }


    }
}
