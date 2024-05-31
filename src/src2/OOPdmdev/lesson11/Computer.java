package OOPdmdev.lesson11;

public abstract class Computer implements Printabale {
    private String name;

    public abstract String getName();

    private Ram ram;
    private Ssd ssd;


    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
    }

    @Override
    public void print() {
        System.out.println("ssd " + ssd.getValue() + "; ram " + ram.getValue());
    }

    public abstract void load();

    public Ram getRam() {
        return ram;
    }

    public Ssd getSsd() {
        return ssd;
    }
}
