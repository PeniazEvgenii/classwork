package decorator;

public class CargoAuto extends Automobile{

    public CargoAuto (Itransport itransport) {
        super(itransport);
    }

    @Override
    public void check() {
        System.out.println("проверил фонари");
    }

    @Override
    public void doOperation() {
        getItransport().doOperation();
        System.out.println("Подцепил прицеп и везу дрова");
    }
}
