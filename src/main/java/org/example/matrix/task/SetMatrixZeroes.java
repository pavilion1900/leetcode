package org.example.matrix.task;

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

    public static void setZeroes(int[][] matrix) {

    }
}
