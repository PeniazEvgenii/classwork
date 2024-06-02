public class ArrayTest {

    public static int[] getTargetofArray(int[] num, int target) {
        int[] result = new int[2];
        for(int i = 0; i < num.length; i++) {
            for(int j = i + 1; j < num.length - 1; j++) {
                if(num[i] + num[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}

class MainTestArray{
    public static void main(String[] args) {

        int[] res = ArrayTest.getTargetofArray(new int[]{1,2,3,4,5},5);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
