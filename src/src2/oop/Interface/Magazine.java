package oop.Interface;

import java.util.Objects;

import static oop.Interface.PrintMain.printAble;

public class Magazine implements Printable{
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public void print() {
        System.out.println("print a magazine " + getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(name, magazine.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void pritMagazines(Printable[] printable){
        for (Printable printable1 : printable) {
            if(printable1 instanceof Magazine){
                System.out.println(((Magazine) printable1).getName());
            }
        }
    }
}
