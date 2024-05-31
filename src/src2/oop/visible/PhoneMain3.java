package oop.visible;

import oop.visible.dto.PhonePrivate;
import oop.visible.dto.SmartPhone;

public class PhoneMain3 {
    public static void main(String[] args) {
        SmartPhone phone1 = new SmartPhone();
        phone1.setBrand("Xiaomi");
        System.out.println(phone1.getBrand());
        setSerialNumber(phone1);
        setModel(phone1);
        System.out.println("brand " + phone1.getBrand());
        System.out.println("serial " + phone1.getSerial());
        System.out.println("model " + phone1.getModel());

        SmartPhone smartPhone1 = new SmartPhone();

        System.out.println(phone1.getBrendAndModel());
    }

    public static void setSerialNumber(SmartPhone phone){

        phone.setSerial("00000001");
    }
    public static void setModel (SmartPhone phone) {

        phone.setModel("A2");
    }

}
