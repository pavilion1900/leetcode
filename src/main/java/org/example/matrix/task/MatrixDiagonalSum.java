package org.example.matrix.task;

public class MatrixDiagonalSum {

//    1572. Matrix Diagonal Sum
//    Easy
//
//    Given a square matrix mat, return the sum of the matrix diagonals.
//
//    Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal
//    that are not part of the primary diagonal.

    public static void main(String[] args) {
        int[][] mat1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(diagonalSum(mat1)); // 25

        int[][] mat2 = new int[][]{
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        System.out.println(diagonalSum(mat2)); // 8

        int[][] mat3 = new int[][]{{5}};
        System.out.println(diagonalSum(mat3)); // 5
    }

    public static int diagonalSum(int[][] mat) {
        return -1;
    }
}
