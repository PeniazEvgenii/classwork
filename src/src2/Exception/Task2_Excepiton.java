package Exception;

public class Task2_Excepiton {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};


        try {
        for (int i = 0; i <= array.length; i++) {

                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException exception){
            System.err.println("catch");
            exception.printStackTrace();
        }
        System.err.println("end");
    }
}
