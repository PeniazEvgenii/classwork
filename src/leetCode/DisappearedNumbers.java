package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DisappearedNumbers {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{1, 1}));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] isAvailable = new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            isAvailable[nums[i]-1] = true;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<isAvailable.length;i++){
            if(!isAvailable[i]){
                ans.add(i+1);
            }
        }
        return ans;
//        List<Integer> list = new LinkedList<>();
//        for (int i = 1; i <= nums.length; i++) {
//            list.add(i);
//        }
//        System.out.println(list);
//        for (int i = 0; i < nums.length; i++) {
//            list.remove(Integer.valueOf(nums[i]));
//        }
//        return list;
    }
}
