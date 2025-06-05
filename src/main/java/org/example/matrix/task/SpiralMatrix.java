package org.example.matrix.task;

import java.util.List;

public class SpiralMatrix {

//    54. Spiral Matrix
//    Medium
//
//    Given an m x n matrix, return all elements of the matrix in spiral order.

    public static void main(String[] args) {
        int[][] mat1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(spiralOrder(mat1)); // [1, 2, 3, 6, 9, 8, 7, 4, 5]
        int[][] mat2 = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(spiralOrder(mat2)); // [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        return null;
    }
}
