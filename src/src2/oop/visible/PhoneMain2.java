package oop.visible;

import oop.visible.dto.PhonePrivate;

public class PhoneMain2 {
    public static void main(String[] args) {
        PhonePrivate phone1 = new PhonePrivate();
        phone1.setBrand("Xiaomi");
        System.out.println(phone1.getBrand());
        setSerialNumber(phone1);
        setModel(phone1);
        System.out.println("brand " + phone1.getBrand());
        System.out.println("serial " + phone1.getSerial());
        System.out.println("model " + phone1.getModel());
    }

    public static void setSerialNumber(PhonePrivate phone){

        phone.setSerial("00000001");
    }
    public static void setModel (PhonePrivate phone) {

        phone.setModel("A2");
    }

}
