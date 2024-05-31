package oop.visible;

public class PhoneMain {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.brand = "Xiaomi";
        System.out.println(phone1.brand);
        setSerialNumber(phone1);
        setModel(phone1);
        System.out.println("brand " + phone1.brand);
        System.out.println("serial " + phone1.serial);
        System.out.println("model " + phone1.model);
    }

    public static void setSerialNumber(Phone phone){
        phone.brand = "00000001";
    }
    public static void setModel (Phone phone) {
        phone.model = "A2";
    }

}
