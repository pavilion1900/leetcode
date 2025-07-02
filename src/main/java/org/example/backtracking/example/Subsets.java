package org.example.backtracking.example;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

//    78. Subsets
//    Medium
//
//    Given an integer array nums of unique elements, return all possible subsets (the power set).
//
//    The solution set must not contain duplicate subsets. Return the solution in any order.

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1, 2, 3})); // [[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]
        System.out.println(subsets(new int[]{0}));       // [[],[0]]
    }

//    Approach 2: Backtracking
//    Time complexity  : O(N * 2 в степени n)
//    Space complexity : O(N)

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> rsl = new ArrayList<>();
        backtrack(nums, rsl, new ArrayList<>(), 0);
        return rsl;
    }

    private static void backtrack(int[] nums, List<List<Integer>> rsl, List<Integer> comb, int start) {
        rsl.add(new ArrayList<>(comb));
        for (int i = start; i < nums.length; i++) {
            comb.add(nums[i]);
            backtrack(nums, rsl, comb, i + 1);
            comb.remove(comb.size() - 1);
        }
    }
}
