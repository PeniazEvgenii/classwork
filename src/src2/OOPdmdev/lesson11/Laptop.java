package OOPdmdev.lesson11;

/**
 * Laptop -> Computer -> Objects
 */


public class Laptop extends Computer {

    private int weight;
    private final String name;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void load() {
        open();
        System.out.println("Я загрузился");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("вес " + getWeight());
    }

    public Laptop(Ram ram, Ssd ssd, int weight, String name){
        super(ram, ssd);
        this.weight = weight;
        super.getRam();
        this.name = name;
    }

    public void open() {
        System.out.println("открыл крыщку");
    }

    public int getWeight() {
        return weight;
    }
}
