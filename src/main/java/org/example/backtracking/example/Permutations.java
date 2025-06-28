package org.example.backtracking.example;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

//    46. Permutations
//    Medium
//
//    Given an array nums of distinct integers, return all the possible permutations.
//    You can return the answer in any order.

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2, 3})); // [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
        System.out.println(permute(new int[]{0, 1}));    // [[0, 1], [1, 0]]
        System.out.println(permute(new int[]{1}));       // [[1]]
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> rsl = new ArrayList<>();
        backtrack(nums, rsl, new ArrayList<>());
        return rsl;
    }

    private static void backtrack(int[] nums, List<List<Integer>> rsl, List<Integer> comb) {
        if (comb.size() == nums.length) {
            rsl.add(new ArrayList<>(comb));
            return;
        }
        for (int num : nums) {
            if (!comb.contains(num)) {
                comb.add(num);
                backtrack(nums, rsl, comb);
                comb.remove(comb.size() - 1);
            }
        }
    }
}
