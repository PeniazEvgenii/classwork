package leetCode;

public class СfindComplement {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
    public static int findComplement(int num) {
        StringBuilder result = new StringBuilder();
        int temp;
        while (num != 0) {
            if((num & 1) == 1) {
                temp = 0;
            } else {
                temp = 1;
            }
            result.insert(0, temp);
            num >>= 1;
        }
        return Integer.parseInt(result.toString(), 2);
//        String binaryString = Integer.toBinaryString(num);
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < binaryString.length(); i++) {
//            if(binaryString.charAt(i) == '1'){
//                stringBuilder.append("0");
//            } else {
//                stringBuilder.append("1");
//            }
//        }
//        return Integer.parseInt(stringBuilder.toString(), 2);
    }
}
