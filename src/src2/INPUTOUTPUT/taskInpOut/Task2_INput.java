package INPUTOUTPUT.taskInpOut;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Task2_INput {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("Classwork", "resourses","test.txt");
        try (Scanner scanner = new Scanner(path)) {
            String wordPrevious = "";
            String wordCurrent;
            while (scanner.hasNext()) {
                wordCurrent = scanner.next();
                wordCurrent = wordCurrent.replaceAll("[,.!]", "");

                if(checkEqualsLastAndFirst(wordPrevious, wordCurrent)) {
                    System.out.println(wordPrevious + "  " + wordCurrent);
                }

                wordPrevious = wordCurrent;
            }
        }
    }

    public static boolean checkEqualsLastAndFirst(String previous, String current) {
       return previous.endsWith(String.valueOf(current.charAt(0)));
    }
}
