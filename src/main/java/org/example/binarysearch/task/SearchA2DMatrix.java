package org.example.binarysearch.task;

public class SearchA2DMatrix {

//    74. Search a 2D Matrix
//    Medium
//
//    You are given an m x n integer matrix matrix with the following two properties:
//    Each row is sorted in non-decreasing order.
//    The first integer of each row is greater than the last integer of the previous row.
//    Given an integer target, return true if target is in matrix or false otherwise.

    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3));  // true
        System.out.println(searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 13)); // false
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        return false;
    }
}
