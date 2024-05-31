package generic.Lesson311;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class TestikiTestiki {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "C:" + separator + "Users" + separator + "evg" + separator + "Desktop" + separator + "Test.txt";
        System.out.println(path);
        System.out.println("C:\\Users\\evg\\Desktop\\Test");
        File file = new File(path);
        PrintWriter pr = new PrintWriter(file);
        pr.println("пошел в жопу");
        pr.println("пошел в жопу ты ч");
        pr.print("пошел в жопу ты ч \n");
        pr.print("пошел в жопу ты ч \n");
        pr.print("пошел в жопу ты ч ghfghfg");

        pr.close();

     //  String line = console.nextLine();
     //  String[] numbers = line.split("\\s+");
     //  int[] num = new int[numbers.length];
     //  for (int i = 0; i < num.length; i++) {
     //      num[i] = Integer.parseInt(numbers[i]);
     //  }
     //  for (int i : num) {
     //      System.out.println(i);
     //  }
     //  console.close();

    }
}
class Car{
    private int idCar;

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }
}
class Toyota extends Car{
    private int idToyota;

    public int getIdToyota() {
        return idToyota;
    }

    public void setIdToyota(int idToyota) {
        this.idToyota = idToyota;
    }
}

class Corolla extends Toyota{
    private int idCorolla;

    public int getIdCorolla() {
        return idCorolla;
    }

    public void setIdCorolla(int idCorolla) {
        this.idCorolla = idCorolla;
    }
}

class Cell <T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}