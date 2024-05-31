package oopILYA;

import oopILYA.dto.*;

class Main1{
    public static void main(String[] args) {
        Man man1 = new Man();
        man1.setName("Вася");
        man1.setAge(32);
        man1.setHair(10);
        man1.setTeethCount(32);

        Man man2 = new Man();
        man2.setName("Петя");
        man2.setAge(35);
        man2.setHair(1);
        man2.setTeethCount(15);

        LiarMan man3 = new LiarMan();
        man3.setTeethCount(23);
        man3.setName("петрович");
        System.out.println(man3.getTeethCount());
        System.out.println(man3.test());

        Biker biker1 = new Biker();
        System.out.println("БАЙКЕР ТОЛЯ " + biker1.getAge());
        System.out.println("БАЙКЕР ТОЛЯ " + biker1.getName());
        System.out.println("БАЙКЕР ТОЛЯ " + biker1.getTeethCount()+"\n");


     //  System.out.println("Man1 имя " + man1.getName());
     //  System.out.println("Man1 возраст " + man1.getAge());
     //  System.out.println("Man1 длина волос " + man1.getHair());
     //  System.out.println("Man1 количество зубов " + man1.getTeethCount());

     //  System.out.println("Man2 имя " + man2.getName());
     //  System.out.println("Man2 возраст " + man2.getAge());
     //  System.out.println("Man2 длина волос " + man2.getHair());
     //  System.out.println("Man1 количество зубов " + man2.getTeethCount());



        Human man4 = new Human();
        man4.setName("Петя");
        man4.setAge(35);
        man4.setTeethCount(15);

        print(man1);
        System.out.println();
        print(man2);
        System.out.println();
        print(man3);
        System.out.println();

        print(biker1);
        System.out.println();
        print(man4);

        System.out.println(man4 instanceof Man);
    }

  //  public static void print(Man man) {                              // перегрузили методы
  //      System.out.println(" имя " + man.getName());
  //      System.out.println(" возраст " + man.getAge());
  //      System.out.println(" длина волос " + man.getHair());
  //      System.out.println(" количество зубов " + man.getTeethCount());
  //  }

    public static void print(IHuman man) {                                  // перегрузили методы
        System.out.println(" имя " + man.getName());
        System.out.println(" возраст " + man.getAge());
        System.out.println(" количество зубов " + man.getTeethCount());
        if(man instanceof Man) {
            System.out.println(" длина волос " + ((Man)man).getHair());
        }
    }

  //  public static void print(Biker man) {                                    // перегрузили методы
  //      System.out.println(" имя " + man.getName());
  //      System.out.println(" возраст " + man.getAge());
  //      System.out.println(" количество зубов " + man.getTeethCount());
  //  }
}

