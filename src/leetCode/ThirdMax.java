package leetCode;

import java.util.*;

public class ThirdMax {
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{1,2,1,0}));
    }

    public static int thirdMax(int[] nums) {
        Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>(set);
        if(list.size() >= 3) {
            return list.get(2);
        }
        return list.get(0);

    }
}
