package leetCode;

import java.util.*;
import java.util.stream.Collectors;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] intersection = intersection(new int[]{1,2,2,2,1,5,10,11,12}, new int[]{2,10,11,2});
        for (int i : intersection) {
            System.out.println(i);
        }
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while ( i < nums1.length && j < nums2.length) {
            if(nums1[i] > nums2[j]) {
                j++;
            } else if(nums1[i] < nums2[j]){
                i++;
            } else {
                System.out.println(nums1[i]);
                i++;
                j++;
            }
        }
//        List<Integer> collect = Arrays.stream(nums1)
//                .boxed()
//                .collect(Collectors.toList());
//        List<Integer> collect2 = Arrays.stream(nums2)
//                .boxed()
//                .collect(Collectors.toList());
//        collect.retainAll(collect2);
////        Set<Integer> set = new HashSet<>(collect);
////        System.out.println(set);
//
//        return collect.stream().mapToInt(Integer::intValue)
//                .toArray();
        return new int[] {0};
    }
}
