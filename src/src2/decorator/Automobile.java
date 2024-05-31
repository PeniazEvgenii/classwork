package decorator;

public abstract class Automobile implements Itransport{
    private Itransport itransport;

    public Automobile(Itransport itransport) {
        this.itransport = itransport;
    }

    @Override
    public void doOperation() {
        System.out.println("превратил в авто");
    }

    public Itransport getItransport() {
        return itransport;
    }

    public abstract void check();
}
