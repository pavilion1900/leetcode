package org.example.array.example;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

//    228. Summary Ranges
//    Easy
//
//    You are given a sorted unique integer array nums.
//
//    A range [a,b] is the set of all integers from a to b (inclusive).
//
//    Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is,
//    each element of nums is covered by exactly one of the ranges, and there is no integer x such that x
//    is in one of the ranges but not in nums.
//
//    Each range [a,b] in the list should be output as:
//
//    - "a->b" if a != b
//    - "a" if a == b

    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));    // [0->2, 4->5, 7]
        System.out.println(summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9})); // [0, 2->4, 6, 8->9]
    }

//    Approach: Fix Left Bound
//    Time complexity  : O(N)
//    Space complexity : O(1)

    public static List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            if (start != nums[i]) {
                ranges.add(start + "->" + nums[i]);
            } else {
                ranges.add(String.valueOf(start));
            }
        }
        return ranges;
    }

//    public static List<String> summaryRanges(int[] nums) {
//        if (nums.length == 1) {
//            return List.of(String.valueOf(nums[0]));
//        }
//
//        List<String> ranges = new ArrayList<>();
//        StringBuilder range = new StringBuilder();
//
//        int i = 0;
//        while (i < nums.length) {
//            if (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
//                range.append(nums[i]).append("->");
//                while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
//                    i++;
//                }
//            } else {
//                range.append(nums[i]);
//                ranges.add(range.toString());
//                range.setLength(0);
//                i++;
//            }
//        }
//        return ranges;
//    }
}
