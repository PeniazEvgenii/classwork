package OOPdmdev.lesson11;

public class MainMobileRunner {
    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ram(8000), new Ssd(480), 2058, "ASUS");
        // laptop.load();


        Computer mobile = new Mobile(new Ram(4096), new Ssd(240));
       // mobile.load();

        loadComputers(laptop, mobile);
    }

    public static void loadComputers (Computer... computers) {
        for(Computer computer: computers) {
            System.out.println(computer.getName());
            computer.print();
            computer.load();
            if (computer instanceof Laptop) {
                System.out.println("привели тип и открыли");
                ((Laptop)computer).open();
            }
            System.out.println();
        }
    }
}
