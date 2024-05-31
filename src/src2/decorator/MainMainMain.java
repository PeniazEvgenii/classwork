package decorator;

public class MainMainMain {
    public static void main(String[] args) {
        Automobile tr = new PassengerAAuto(new CargoAuto(new Motobike()));
        tr.doOperation();
    }
}
