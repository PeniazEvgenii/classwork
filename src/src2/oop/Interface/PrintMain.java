package oop.Interface;

public class PrintMain {
    public static void main(String[] args) {
        Printable book1 = new Book("Book1");
        Printable book2 = new Book("Book2");
        Printable book3 = new Book("Book3");
        Printable book4 = new Book("Book4");

        Printable magazine1 = new Magazine("Magazine1");
        Printable magazine2 = new Magazine("Magazine2");
        Printable magazine3 = new Magazine("Magazine3");
        Printable magazine4 = new Magazine("Magazine4");
        // printAble(book1,book2,book3,book4,magazine1,magazine2,magazine3,magazine4);
        // System.out.println(book1.toString());
        Printable[] printables = {book1, book2, book3, book4, magazine1, magazine2, magazine3, magazine4};

        // System.out.println(book1.equals(book2));
        System.out.println("сравнение с созданием " + book1.equals(new Book("Book2")));
        // System.out.println(book1.getClass());
        // System.out.println(book1.hashCode());
        // System.out.println(book2.hashCode());

        System.out.println(book1);

        // Book.pritBooks(printables);
        // Magazine.pritMagazines(printables);
        Integer a = new Integer(555);
        System.out.println(a);
        Double d = new Double(5.555);
        Double dd = new Double("55.77");
        System.out.println(Integer.toHexString(a));
    }


    public static void printAble(Printable... print) {
        for (Printable printable : print) {
            System.out.println(printable.toString());
            printable.print();
        }
    }
}
