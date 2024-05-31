package INPUTOUTPUT;

import java.io.File;
import java.io.IOException;

public class FileRunner {
    public static void main(String[] args) throws IOException {
        String s = File.separator;
        File file = new File("C:"+ s +"Users"+ s +"evg\\IdeaProjects\\JD1\\ClassWork\\resourses\\test.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());
    }
}
