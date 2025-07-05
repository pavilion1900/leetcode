package org.example.array.example;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

//    560. Subarray Sum Equals K
//    Medium
//
//    Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//
//    A subarray is a contiguous non-empty sequence of elements within an array.

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 1, 1}, 2));  // 2
        System.out.println(subarraySum(new int[]{1, 2, 3}, 3));  // 2
        System.out.println(subarraySum(new int[]{1, -1, 0}, 0)); // 3
    }

//    Approach 3: Without Space
//    Time complexity  : O(n в степени 2)
//    Space complexity : O(1)
//
//    public static int subarraySum(int[] nums, int k) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int sum = 0;
//            for (int j = i; j < nums.length; j++) {
//                sum += nums[j];
//                if (sum == k) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

//    Approach 4: Using Hashmap
//    Time complexity  : O(N)
//    Space complexity : O(N)

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
