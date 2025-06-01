package org.example.matrix.example;

import java.util.Arrays;

public class SetMatrixZeroes {

//    73. Set Matrix Zeroes
//    Medium
//
//    Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
//
//    You must do it in place.

    public static void main(String[] args) {
        int[][] mat1 = new int[][]{
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        setZeroes(mat1);
        System.out.println(Arrays.deepToString(mat1)); // [[1, 0, 1], [0, 0, 0], [1, 0, 1]]
        int[][] mat2 = new int[][]{
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        setZeroes(mat2);
        System.out.println(Arrays.deepToString(mat2)); // [[0, 0, 0, 0], [0, 4, 5, 0], [0, 3, 1, 0]]
    }

//    public static void setZeroes(int[][] matrix) {
//        int height = matrix.length;
//        int width = height > 0 ? matrix[0].length : 0;
//        Set<Integer> rows = new HashSet<>();
//        Set<Integer> cols = new HashSet<>();
//        for (int row = 0; row < height; row++) {
//            for (int col = 0; col < width; col++) {
//                if (matrix[row][col] == 0) {
//                    rows.add(row);
//                    cols.add(col);
//                }
//            }
//        }
//        for (int row = 0; row < height; row++) {
//            for (int col = 0; col < width; col++) {
//                if (rows.contains(row) || cols.contains(col)) {
//                    matrix[row][col] = 0;
//                }
//            }
//        }
//    }
//
//    public static void setZeroes(int[][] matrix) {
//        int length = matrix.length;
//        int width = length > 0 ? matrix[0].length : 0;
//        boolean isCol = false;
//        for (int row = 0; row < length; row++) {
//            if (matrix[row][0] == 0) {
//                isCol = true;
//            }
//            for (int col = 1; col < width; col++) {
//                if (matrix[row][col] == 0) {
//                    matrix[row][0] = 0;
//                    matrix[0][col] = 0;
//                }
//            }
//        }
//        for (int row = 1; row < length; row++) {
//            for (int col = 1; col < width; col++) {
//                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
//                    matrix[row][col] = 0;
//                }
//            }
//        }
//        if (matrix[0][0] == 0) {
//            for (int col = 1; col < width; col++) {
//                matrix[0][col] = 0;
//            }
//        }
//        if (isCol) {
//            for (int row = 0; row < length; row++) {
//                matrix[row][0] = 0;
//            }
//        }
//    }

    public static void setZeroes(int[][] matrix) {
        int height = matrix.length;
        int width = height > 0 ? matrix[0].length : 0;
        boolean isFirstRowZero = false;

        for (int row = 0; row < height; row++) {
            if (matrix[row][0] == 0) {
                isFirstRowZero = true;
            }
            for (int col = 1; col < width; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }

        for (int row = height - 1; row >= 0; row--) {
            for (int col = width - 1; col >= 1; col--) {
                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0;
                }
            }
            if (isFirstRowZero) {
                matrix[row][0] = 0;
            }
        }
    }
}
