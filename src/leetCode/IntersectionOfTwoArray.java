package leetCode;

import java.util.*;
import java.util.stream.Collectors;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] intersection = intersection(new int[]{1,2,2,2,1}, new int[]{2});
        for (int i : intersection) {
            System.out.println(i);
        }
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> collect = Arrays.stream(nums1)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> collect2 = Arrays.stream(nums2)
                .boxed()
                .collect(Collectors.toList());
        collect.retainAll(collect2);
//        Set<Integer> set = new HashSet<>(collect);
//        System.out.println(set);

        return collect.stream().mapToInt(Integer::intValue)
                .toArray();
    }
}
