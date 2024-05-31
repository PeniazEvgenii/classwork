package oop.Interface;

import java.util.Objects;

import static oop.Interface.PrintMain.printAble;

public class Book implements Printable{
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("print a book " + getName());
    }

    @Override
    public String toString() {
        return super.toString() + "  " +
                "Book{" +
                "name='" + name + '\'' +
                '}';
    }

    public String result() {
        return "Это книга " + getName();
    }

    public static void pritBooks(Printable[] printable){
        for (Printable printable1 : printable) {
            if(printable1 instanceof Book){
                printAble(printable1);
            }
        }
    }
}
