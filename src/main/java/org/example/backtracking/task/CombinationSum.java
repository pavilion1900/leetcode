package org.example.backtracking.task;

import java.util.List;

public class CombinationSum {

//    39. Combination Sum
//    Medium
//
//    Given an array of distinct integers candidates and a target integer target, return a list of all unique
//    combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
//
//    The same number may be chosen from candidates an unlimited number of times. Two combinations are unique
//    if the frequency of at least one of the chosen numbers is different.
//
//    The test cases are generated such that the number of unique combinations that sum up to target is less than
//    150 combinations for the given input.

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2, 3, 6, 7}, 7)); // [[2, 2, 3], [7]]
        System.out.println(combinationSum(new int[]{2, 3, 5}, 8));    // [[2, 2, 2, 2], [2, 3, 3], [3, 5]]
        System.out.println(combinationSum(new int[]{2}, 1));          // []
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        return null;
    }
}
