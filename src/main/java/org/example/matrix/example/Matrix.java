package org.example.matrix.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

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
        int height = mat.length;
        int width = mat[0].length;
        int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[][] matrix = new int[height][width];
        boolean[][] seen = new boolean[height][width];
        Queue<State> queue = new LinkedList<>();
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                matrix[row][col] = mat[row][col];
                if (mat[row][col] == 0) {
                    queue.offer(new State(row, col, 0));
                    seen[row][col] = true;
                }
            }
        }
        while (!queue.isEmpty()) {
            State state = queue.poll();
            int row = state.row;
            int col = state.col;
            int steps = state.steps;
            for (int[] direction : directions) {
                int nextRow = row + direction[1];
                int nextCol = col + direction[0];
                if (isValid(nextRow, nextCol, height, width) && !seen[nextRow][nextCol]) {
                    queue.offer(new State(nextRow, nextCol, steps + 1));
                    matrix[nextRow][nextCol] = steps + 1;
                    seen[nextRow][nextCol] = true;
                }
            }
        }
        return matrix;
    }

    private static boolean isValid(int row, int col, int height, int width) {
        return row >= 0 && col >= 0 && row < height && col < width;
    }
}

class State {

    int row;
    int col;
    int steps;

    State(int row, int col, int steps) {
        this.row = row;
        this.col = col;
        this.steps = steps;
    }
}
