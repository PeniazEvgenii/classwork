package decorator;

public class PassengerAAuto extends Automobile{

    public PassengerAAuto(Itransport itransport){
        super(itransport);
    }

    @Override
    public void check() {
        System.out.println("проверил ремни");
    }

    @Override
    public void doOperation() {
        getItransport().doOperation();
        System.out.println("Прицепил коляску и Везу 5 человек");
    }


}
