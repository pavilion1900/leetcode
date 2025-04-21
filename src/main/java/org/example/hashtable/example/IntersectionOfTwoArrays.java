package org.example.hashtable.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

//        349. Intersection of Two Arrays
//        Easy
//
//        Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result
//        must be unique and you may return the result in any order.

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));       // [2]
        System.out.println(Arrays.toString(intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}))); // [9, 4] or [4, 9]
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersection(nums2, nums1);
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        int index = 0;
        for (int num : nums2) {
            if (set.contains(num)) {
                nums1[index++] = num;
                set.remove(num);
            }
        }
        return Arrays.copyOfRange(nums1, 0, index);
    }

//    public static int[] intersection(int[] nums1, int[] nums2) {
//        Set<Integer> set1 = new HashSet<>();
//        for (Integer n : nums1) {
//            set1.add(n);
//        }
//        Set<Integer> set2 = new HashSet<>();
//        for (Integer n : nums2) {
//            set2.add(n);
//        }
//        set1.retainAll(set2);
//        int[] output = new int[set1.size()];
//        int idx = 0;
//        for (int s : set1) {
//            output[idx++] = s;
//        }
//        return output;
//    }

//    public static int[] intersection(int[] nums1, int[] nums2) {
//        Set<Integer> set1 = new HashSet<>();
//        for (Integer n : nums1) {
//            set1.add(n);
//        }
//        Set<Integer> set2 = new HashSet<>();
//        for (Integer n : nums2) {
//            set2.add(n);
//        }
//        if (set1.size() < set2.size()) {
//            return setIntersection(set1, set2);
//        } else {
//            return setIntersection(set2, set1);
//        }
//    }
//
//    private static int[] setIntersection(Set<Integer> set1, Set<Integer> set2) {
//        int[] output = new int[set1.size()];
//        int idx = 0;
//        for (Integer s : set1) {
//            if (set2.contains(s)) {
//                output[idx++] = s;
//            }
//        }
//        return Arrays.copyOf(output, idx);
//    }

//    public static int[] intersection(int[] nums1, int[] nums2) {
//        Map<Integer, Integer> seen = new HashMap<>();
//        List<Integer> result = new ArrayList<>();
//
//        for (int x : nums1) {
//            seen.put(x, 1);
//        }
//
//        for (int x : nums2) {
//            if (seen.containsKey(x) && seen.get(x) == 1) {
//                result.add(x);
//                seen.put(x, 0);
//            }
//        }
//        return result.stream().mapToInt(i -> i).toArray();
//    }
}
