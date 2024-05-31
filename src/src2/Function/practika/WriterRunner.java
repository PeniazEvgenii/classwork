package Function.practika;

import java.io.*;
import java.nio.file.Path;
import java.util.Comparator;

public class WriterRunner {
    public static void main(String[] args) throws IOException {
        File file = Path.of("classwork","resourses","writer.txt").toFile();
        try (FileWriter fileWriter1 = new FileWriter(file, true)) {
            fileWriter1.write("fdfdfds");
        }


        try (BufferedWriter fileWriter =new BufferedWriter(new FileWriter(file, true))) {
      fileWriter.newLine();
      fileWriter.append("Hello world!!");
      fileWriter.newLine();
      fileWriter.append("Java");

  }

        try (BufferedInputStream bs = new BufferedInputStream(new FileInputStream(file))) {
          byte[] bytes = new byte[bs.available()];

          int count = 0;
          int current;
          while ((current = bs.read()) != -1) {
              bytes[count++] = (byte) current;
          }
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {


            int count = 0;
            String current;
            while ((current = br.readLine()) != null) {
                System.out.println(current);
            }
        }
    }
}
