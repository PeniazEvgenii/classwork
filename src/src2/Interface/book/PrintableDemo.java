package Interface.book;

public class PrintableDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Name1");
        Book book2 = new Book("Name2");
        Magazine magazine1 = new Magazine("Magazine1");
        Magazine magazine2 = new Magazine("Magazine2");

        Printable[] printables = {book1, book2, magazine1, magazine2};
        for(Printable printable : printables){
            printable.print();

        }
    }
}
