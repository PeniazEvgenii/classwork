package OOPdmdev.lesson11;

public class MainLesson11Computer {
    public static void main(String[] args) {
        Ram ram = new Ram(16_000);
        Ssd ssd = new Ssd(1024);


        Ram ram1 = new Ram(8_000);
        Ssd ssd1 = new Ssd(512);
        Laptop laptop1 = new Laptop(ram, ssd,1024, "ASUS");
        Laptop laptop2 = new Laptop(ram1, ssd1,2000, "LENOVO");

        Laptop laptop3 = new Laptop(new Ram(512), new Ssd(240),2012, "ACER");
        laptop3.open();
        laptop3.load();




        printPrameters(laptop1);
        printPrameters(laptop2);


    }

    private static void printPrameters(Laptop laptop) {
        System.out.println("оперативка " + laptop.getRam().getValue());
        System.out.println("ccд " + laptop.getSsd().getValue());
        System.out.println("вес " + laptop.getWeight());
    }
}
