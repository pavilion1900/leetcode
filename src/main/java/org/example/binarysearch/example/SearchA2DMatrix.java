package org.example.binarysearch.example;

public class SearchA2DMatrix {

    public static void main(String[] args) {
//        74. Search a 2D Matrix
//        Medium
//
//        You are given an m x n integer matrix matrix with the following two properties:
//        Each row is sorted in non-decreasing order.
//        The first integer of each row is greater than the last integer of the previous row.
//        Given an integer target, return true if target is in matrix or false otherwise.

        System.out.println(searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3));  // true
        System.out.println(searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 13)); // false
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        if (row == 0) {
            return false;
        }
        int col = matrix[0].length;
        int left = 0;
        int right = row * col - 1;
        while (left <= right) {
            int midInd = (left + right) >>> 1;
            int midVal = matrix[midInd / col][midInd % col];
            if (midVal == target) {
                return true;
            } else if (midVal > target) {
                right = --midInd;
            } else {
                left = ++midInd;
            }
        }
        return false;
    }
}
