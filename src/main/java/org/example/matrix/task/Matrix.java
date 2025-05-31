package org.example.matrix.task;

import java.util.Arrays;

public class Matrix {

//    542. 01 Matrix
//    Medium
//
//    Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.
//
//    The distance between two cells sharing a common edge is 1.

    public static void main(String[] args) {
        int[][] mat1 = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        System.out.println(Arrays.deepToString(updateMatrix(mat1))); // [[0, 0, 0], [0, 1, 0], [0, 0, 0]]
        int[][] mat2 = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        System.out.println(Arrays.deepToString(updateMatrix(mat2))); // [[0, 0, 0], [0, 1, 0], [1, 2, 1]]
    }

    public static int[][] updateMatrix(int[][] mat) {
        return null;
    }
}
