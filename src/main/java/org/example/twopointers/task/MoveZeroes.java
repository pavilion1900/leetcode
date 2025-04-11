package org.example.twopointers.task;

import java.util.Arrays;

public class MoveZeroes {

//        283. Move Zeroes
//        Easy
//
//        Given an integer array nums, move all 0's to the end of it while maintaining the relative order
//        of the non-zero elements.
//        Note that you must do this in-place without making a copy of the array.

    public static void main(String[] args) {
        int[] array1 = new int[]{0, 1, 0, 3, 12};
        int[] array2 = new int[]{0};
        int[] array3 = new int[]{1};
        int[] array4 = new int[]{1, 0};
        int[] array5 = new int[]{2, 1};
        moveZeroes(array1);
        moveZeroes(array2);
        moveZeroes(array3);
        moveZeroes(array4);
        moveZeroes(array5);
        System.out.println(Arrays.toString(array1)); // [1, 3, 12, 0, 0]
        System.out.println(Arrays.toString(array2)); // [0]
        System.out.println(Arrays.toString(array3)); // [1]
        System.out.println(Arrays.toString(array4)); // [1, 0]
        System.out.println(Arrays.toString(array5)); // [2, 1]
    }

    public static void moveZeroes(int[] nums) {

    }
}
