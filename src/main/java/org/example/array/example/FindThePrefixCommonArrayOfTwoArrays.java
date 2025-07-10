package org.example.array.example;

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

//    Approach 2: Hash Set
//    Time complexity  : O(n2)
//    Space complexity : O(N)

//    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
//        int arrLen = A.length;
//        int[] rsl = new int[arrLen];
//
//        Set<Integer> setA = new HashSet<>();
//        Set<Integer> setB = new HashSet<>();
//
//        for (int i = 0; i < arrLen; i++) {
//            setA.add(A[i]);
//            setB.add(B[i]);
//
//            int count = 0;
//            for (int num : setA) {
//                if (setB.contains(num)) {
//                    count++;
//                }
//            }
//            rsl[i] = count;
//        }
//        return rsl;
//    }

//    Approach 3: Single Pass with Frequency Array
//    Time complexity  : O(N)
//    Space complexity : O(N)

    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int arrLen = A.length;
        int[] rsl = new int[arrLen];
        int[] freq = new int[arrLen + 1];
        int count = 0;

        for (int i = 0; i < arrLen; i++) {
            freq[A[i]]++;
            if (freq[A[i]] == 2) {
                count++;
            }
            freq[B[i]]++;
            if (freq[B[i]] == 2) {
                count++;
            }
            rsl[i] = count;
        }
        return rsl;
    }
}
