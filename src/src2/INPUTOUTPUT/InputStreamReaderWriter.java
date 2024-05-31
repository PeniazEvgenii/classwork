package INPUTOUTPUT;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputStreamReaderWriter {
    public static final String RUSSUIAN_VOWEL = "аоеуяию";
    public static void main(String[] args){
        Path path = Path.of("classwork/resourses/test.txt");
        File file = new File("classwork/resourses/test.txt");

//        try (Scanner scanner = new Scanner(file).useLocale(Locale.US)) {
//            scanner.useDelimiter("[\\[\\].,!?]?\\s+[\\[\\].,!?]?");
//
//            scanner.tokens()
//                    .filter(InputStreamReaderWriter::isVowel)
//                    .forEach(System.out::println);

          // while(scanner.hasNext()) {
          //     String current = scanner.next();
          //     if(RUSSUIAN_VOWEL.indexOf(current.toLowerCase().charAt(0)) != -1) {
          //         System.out.println(current);
          //     }
          // }

//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }


//        // TASK 2 TASK 2 TASK 2 TASK 2 TASK 2 TASK 2
//        try (Scanner scanner = new Scanner(file)) {
//            scanner.useDelimiter("[\\[\\].,!?]?\\s+[\\[\\].,!?]?");
//
//            String word;
//            String prev = "";
//
//            while(scanner.hasNext()) {
//                word = scanner.next().toLowerCase();
//
//                if (prev.indexOf(word.charAt(0)) == (prev.length() - 1)) {
//                    System.out.println(prev + "  " + word);
//                }
//                prev = word;
//            }
//
//
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

//        try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
//            String current;
//            while ( (current = bf.readLine()) != null ) {
//                String result = checkDigit(current);
//                System.out.println(current);
//                if (result.isEmpty()) {
//                    System.out.println(0);
//                } else {
//                    System.out.println(result);
//                }
//            }
//
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        Path path2 = Path.of("classwork/resourses/ReplacePublic2.txt");
        Path path1 = Path.of("classwork/src/INPUTOUTPUT/taskInpOut/Task3_INput.java");
        System.out.println(path1.toFile().exists());

        try (Stream<String> lines = Files.lines(path1); BufferedWriter bf =
                                new BufferedWriter(new FileWriter(path2.toFile()))) {

            lines.map(StringBuffer::new)
                    .map(StringBuffer::reverse)
                    .forEach(s -> {
                        try {
                            bf.write(s.toString());
                            bf.newLine();
                        } catch (IOException e) {
                            System.err.println("ощибка чтения файла");;
                        }
                    });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


//        try {
//            String s = Files.readString(path1);
//            String sNew = s.replace("public", "private");
//            Files.writeString(path2,sNew, StandardOpenOption.APPEND);
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        // try {
      //     String collect = Files.readAllLines(path1).stream()
      //             .map(s -> s.replace("public", "private"))
      //             .map(s -> s + "\n")
      //                     .collect(Collectors.joining());
      //     System.out.println(collect);
      // } catch (IOException e) {
      //     throw new RuntimeException(e);
      // }


    }
    public static boolean isVowel(String s)  {
        return RUSSUIAN_VOWEL.indexOf(s.charAt(0)) != -1;
    }

    public static String checkDigit(String str) {
        int count = 0;
        int sum = 0;
        String number = "";
        String numberRes = "";

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if(current > '0' && current < '9') {
                count++;
                number += current;
            } else {
                if(count > sum) {
                    sum = count;
                    numberRes = number;
                }
                count = 0;
                number = "";
            }
        }
        if (!number.isEmpty()){
            numberRes = number;
        }
        return numberRes;
    }
}
