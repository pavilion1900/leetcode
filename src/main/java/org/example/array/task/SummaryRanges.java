package org.example.array.task;

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

    public static List<String> summaryRanges(int[] nums) {
        return null;
    }
}
