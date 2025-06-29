package org.example.binarysearch.example;

public class SearchA2DMatrixII {

//    240. Search a 2D Matrix II
//    Medium
//
//    Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix.
//    This matrix has the following properties:
//    Integers in each row are sorted in ascending from left to right.
//    Integers in each column are sorted in ascending from top to bottom.

    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        }, 5));  // true
        System.out.println(searchMatrix(new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        }, 20)); // false
    }

//    Approach 1: Brute Force [Don't use]
//    Time complexity  : O(n * m)
//    Space complexity : O(1)
//
//    public static boolean searchMatrix(int[][] matrix, int target) {
//        for (int row = 0; row < matrix.length; row++) {
//            for (int col = 0; col < matrix[0].length; col++) {
//                if (matrix[row][col] == target) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

//    Approach 4: Search Space Reduction
//    Time complexity  : O(n + m)
//    Space complexity : O(1)

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0 && col < matrix[0].length) {
            int val = matrix[row][col];
            if (val == target) {
                return true;
            } else if (val > target) {
                row--;
            } else {
                col++;
            }
        }
        return false;
    }
}
