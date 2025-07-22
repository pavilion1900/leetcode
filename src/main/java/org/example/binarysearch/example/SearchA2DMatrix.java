package org.example.binarysearch.example;

public class SearchA2DMatrix {

//    74. Search a 2D Matrix
//    Medium
//
//    You are given an m x n integer matrix matrix with the following two properties:
//    Each row is sorted in non-decreasing order.
//    The first integer of each row is greater than the last integer of the previous row.
//    Given an integer target, return true if target is in matrix or false otherwise.

    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        }, 3));  // true
        System.out.println(searchMatrix(new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        }, 13)); // false
    }

//    Approach 1: Binary Search
//    Time complexity  : O(log(n * m))
//    Space complexity : O(1)

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        if (rows == 0) {
            return false;
        }
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int midInd = (left + right) >>> 1;
            int midVal = matrix[midInd / cols][midInd % cols];
            if (midVal == target) {
                return true;
            } else if (midVal > target) {
                right = midInd - 1;
            } else {
                left = midInd + 1;
            }
        }
        return false;
    }
}
