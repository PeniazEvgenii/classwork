package generic;

public class MainGeneric1 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,23,45,556};
        Long[] arr1 = {1l,2l,3l,23l,45l,556l};
        Double[] arr2 = {1d,2d,3d,23d,45d,556d};

        System.out.println(sum(arr));
        System.out.println(sum(arr1));
        System.out.println(sum(arr2));

    }
    public static int sum(Number[] arr) {
        int sum = 0;
        for (Number i : arr) {
            sum += i.intValue();
        }
        return sum;
    }
}
