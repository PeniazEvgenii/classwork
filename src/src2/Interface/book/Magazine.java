package Interface.book;

import java.util.Objects;

public class Magazine implements Printable {
   private String name;

   public Magazine(String name){
       this.name = name;
   }

   public void setName(String name) {
       this.name = name;
   }
   public String getName() {
       return name;
   }

    @Override
    public void print() {
        System.out.println("Печатаем журнал " + getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(name, magazine.name);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
