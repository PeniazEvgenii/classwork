package collection;


import java.util.ArrayList;
import java.util.List;

public class PECS {
    public static void main(String[] args) {
        Car car1 = new Toyota();
        Car car2 = new Corolla();

        Toyota toyota = new Toyota();
        Corolla corolla = new Corolla();
        Avalon avalon = new Avalon();

        Mazda mazda = new Mazda();
        Six six = new Six();
        Three three = new Three();

        List<? extends Toyota> toyotaList = new ArrayList<>();
      // toyotaList.add(toyota);
      // toyotaList.add(corolla);
      // toyotaList.add(avalon);

        List<Corolla> corollaList = new ArrayList<>();
        corollaList.add(corolla);
        List<Avalon> avlonList = new ArrayList<>();
        avlonList.add(avalon);

        List<Mazda> mazdaList = new ArrayList<>();
        mazdaList.add(mazda);
        mazdaList.add(six);
        mazdaList.add(three);

        List<Six> sixList = new ArrayList<>();
        sixList.add(six);
        List<Three> threeList = new ArrayList<>();
        threeList.add(three);

        List<Car> carList = new ArrayList<>();
        carList.add(toyota);
        carList.add(corolla);
        carList.add(mazda);
        carList.add(six);


    }

    public static void print (List<? extends Toyota> list){
        for (Toyota toyota : list) {
            toyota.setId(5);
        }
    }
}
interface Car{ Integer run();};

class Toyota implements Car{
    private Integer id;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public Integer run() {
        return 0;
    }
}

class Mazda implements Car{
    @Override
    public Integer run() {
        return 0;
    }
}
class Corolla extends Toyota implements Comparable<Corolla> {
    private Integer id;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public int compareTo(Corolla o) {
        return getId() - o.getId();
    }
}

class Avalon extends Toyota implements Comparable<Avalon> {
    private Integer id;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public int compareTo(Avalon o) {
        return getId() - o.getId();
    }
}

class Six extends Mazda implements Comparable<Six> {
    private Integer id;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public int compareTo(Six o) {
        return getId() - o.getId();
    }
}
class Three extends Mazda implements Comparable<Three> {
    private Integer id;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public int compareTo(Three o) {
        return getId() - o.getId();
    }
}