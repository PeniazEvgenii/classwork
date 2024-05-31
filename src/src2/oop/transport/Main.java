package oop.transport;

public class Main {
    public static void main(String[] args) {
        Cupe cupe1 = new Cupe();
        cupe1.setBrand("Nissan");
        cupe1.setModel("GTR");
        cupe1.setCountWheel(4);
        cupe1.setCountDoors(4);//

        Cupe cupe2 = new Cupe();
        cupe2.setBrand("Ford");
        cupe2.setModel("Mustang");
        cupe2.setCountWheel(4);
        cupe2.setCountDoors(4);//


        Limusin limusin1 = new Limusin();
        limusin1.setBrand("Hummer");
        limusin1.setModel("H2");
        limusin1.setCountWheel(6);
        limusin1.setCountDoors(4);
        limusin1.setDlina(10);
        limusin1.setKolvoSeats(15);

        Tractor tractor = new Tractor();


        printObject(cupe1);
        printObject(cupe2);
        printObject(limusin1);
        printObject(tractor);

    }

    public static void printObject(Limusin cupe) {
        System.out.println("-------------------------");
        System.out.println("Брэнд " + cupe.getBrand());
        System.out.println("модель " + cupe.getModel());
        System.out.println("колво колес " + cupe.getCountWheel());
        System.out.println("колво двере " + cupe.getCountDoors());
        System.out.println("колво сидений " + cupe.getKolvoSeats());
        System.out.println("длина " + cupe.getDlina());
    }

    public static void printObject(Cars car) {
        System.out.println("-------------------------");
        System.out.println("Брэнд " + car.getBrand());
        System.out.println("модель " + car.getModel());
        System.out.println("колво колес " + car.getCountWheel());
        System.out.println("колво двере " + car.getCountDoors());
        System.out.println("колво сидений " + car.getKolvoSeats());
    }
    public static void printObject(Itransport car) {
        System.out.println("-------------------------");
        System.out.println("Брэнд " + car.getBrand());
        System.out.println("модель " + car.getModel());
        System.out.println("колво колес " + car.getCountWheel());
        System.out.println("колво двере " + car.getCountDoors());
    }

}
