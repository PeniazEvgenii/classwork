package generic;

public class TESTIkKKKK <T, V, K>{
    private T one;
    private V two;
    private K three;

    public TESTIkKKKK(T one, V two, K three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }

    public T getOne() {
        return one;
    }

    public V getTwo() {
        return two;
    }

    public K getThree() {
        return three;
    }

    public void getNameAllVariable() {
        System.out.println(one.getClass().getName());
        System.out.println(two.getClass().getName());
        System.out.println(three.getClass().getName());
    }
}
class MatinTesor {
    public static void main(String[] args) {
        TESTIkKKKK <String, Integer, Byte> ob1 = new TESTIkKKKK<>("Объект1",55,(byte)65);
        TESTIkKKKK <String, Integer, Byte> ob2 = new TESTIkKKKK<>("Объект2",40,(byte)81);
        TESTIkKKKK <String, Integer, Byte> ob3 = new TESTIkKKKK<>("Объект3",38,(byte)100);
        ob1.getNameAllVariable();

        TESTIkKKKK < Integer,String, Byte> ob4 = new TESTIkKKKK<>(22,"Объект4",(byte)100);
        TESTIkKKKK < Integer, Byte, String> ob5 = new TESTIkKKKK<>(55,(byte)38,"Объект5");
        TESTIkKKKK <String,  Byte, Integer> ob6 = new TESTIkKKKK<>("Объект6",(byte)38,100);

        getAllFrom(ob4);
        getAllFrom(ob5);
        getAllFrom(ob6);

    }
    public static <T,V,K> void getAllFrom(TESTIkKKKK <T,V,K> test){
        System.out.println(test.getOne());
        System.out.println(test.getTwo());
        System.out.println(test.getThree());
    }
}
