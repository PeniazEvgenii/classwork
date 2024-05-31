package OOPdmdev.lesson11;

public class MAINRUNNER {
    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ram(8000), new Ssd(480), 2058, "ASUS");
        // laptop.load();


        Computer mobile = new Mobile(new Ram(4096), new Ssd(240));
        // mobile.load();


        printWithRandom(laptop, mobile);
    }
    public static void print(Printabale... objects){
        for (Printabale object : objects) {
            object.print();
        }
    }

    public static void printWithRandom(Printabale... objects){
        for (Printabale object : objects) {
            object.printWithRandom();
            System.out.println();
        }
    }
}
