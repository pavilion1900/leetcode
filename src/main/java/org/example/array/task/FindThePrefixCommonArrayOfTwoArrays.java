package org.example.array.task;

import java.util.Arrays;

public class FindThePrefixCommonArrayOfTwoArrays {

//    2657. Find the Prefix Common Array of Two Arrays
//    Medium
//
//    You are given two 0-indexed integer permutations A and B of length n.
//
//    A prefix common array of A and B is an array C such that C[i] is equal to the count of numbers that are
//    present at or before the index i in both A and B.
//
//    Return the prefix common array of A and B.
//
//    A sequence of n integers is called a permutation if it contains all integers from 1 to n exactly once.

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findThePrefixCommonArray(new int[]{1, 3, 2, 4}, new int[]{3, 1, 2, 4}))); // [0, 2, 3, 4]
        System.out.println(Arrays.toString(findThePrefixCommonArray(new int[]{2, 3, 1}, new int[]{3, 1, 2})));       // [0, 1, 3]
    }

    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        return null;
    }
}
