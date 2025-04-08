package org.example.twopointers.task;

import java.util.Arrays;

public class TwoSumIIInputArrayIsSorted {

    public static void main(String[] args) {
//        167. Two Sum II - Input Array Is Sorted
//        Medium
//
//        Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two
//        numbers such that they add up to a specific target number. Let these two numbers be numbers[index1]
//        and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
//        Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2]
//        of length 2.
//        The tests are generated such that there is exactly one solution. You may not use the same element twice.
//        Your solution must use only constant extra space.

        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));  // [1, 2]
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 26))); // [3, 4]
        System.out.println(Arrays.toString(twoSum(new int[]{2, 3, 4}, 6)));       // [1, 3]
        System.out.println(Arrays.toString(twoSum(new int[]{-1, 0}, -1)));        // [1, 2]
        System.out.println(Arrays.toString(twoSum(new int[]{-1, 0}, 10)));        // [-1, -1]
    }

    public static int[] twoSum(int[] numbers, int target) {
        return new int[]{};
    }
}
