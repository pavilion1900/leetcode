package org.example.backtracking.task;

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

    public static List<List<Integer>> subsets(int[] nums) {
        return null;
    }
}
