package org.example.hashtable.example;

public class ValidSudoku {

//        36. Valid Sudoku
//        Medium
//
//        Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
//
//        Each row must contain the digits 1-9 without repetition.
//        Each column must contain the digits 1-9 without repetition.
//        Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
//        Note:
//
//        A Sudoku board (partially filled) could be valid but is not necessarily solvable.
//        Only the filled cells need to be validated according to the mentioned rules.

    public static void main(String[] args) {
        char[][] board1 = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'},
        };
        char[][] board2 = new char[][]{
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'},
        };
        System.out.println(isValidSudoku(board1)); // true
        System.out.println(isValidSudoku(board2)); // false
    }

//    public static boolean isValidSudoku(char[][] board) {
//        int num = board.length;
//        if (num == 0) {
//            return false;
//        }
//        List<HashSet<Character>> rows = new ArrayList<>(num);
//        List<HashSet<Character>> cols = new ArrayList<>(num);
//        List<HashSet<Character>> boxes = new ArrayList<>(num);
//        for (int i = 0; i < num; i++) {
//            rows.add(new HashSet<Character>());
//            cols.add(new HashSet<Character>());
//            boxes.add(new HashSet<Character>());
//        }
//        for (int row = 0; row < num; row++) {
//            for (int col = 0; col < num; col++) {
//                char val = board[row][col];
//                if (val == '.') {
//                    continue;
//                }
//                if (rows.get(row).contains(val)) {
//                    return false;
//                }
//                rows.get(row).add(val);
//                if (cols.get(col).contains(val)) {
//                    return false;
//                }
//                cols.get(col).add(val);
//                int index = (row / 3) * 3 + col / 3;
//                if (boxes.get(index).contains(val)) {
//                    return false;
//                }
//                boxes.get(index).add(val);
//            }
//        }
//        return true;
//    }

    public static boolean isValidSudoku(char[][] board) {
        int num = board.length;
        if (num == 0) {
            return false;
        }
        int[] rows = new int[num];
        int[] cols = new int[num];
        int[] boxes = new int[num];
        for (int row = 0; row < num; row++) {
            for (int col = 0; col < num; col++) {
                if (board[row][col] == '.') {
                    continue;
                }
                int val = board[row][col] - '0';
                int pos = 1 << (val - 1);
                if ((rows[row] & pos) > 0) {
                    return false;
                }
                rows[row] |= pos;
                if ((cols[col] & pos) > 0) {
                    return false;
                }
                cols[col] |= pos;
                int index = (row / 3) * 3 + col / 3;
                if ((boxes[index] & pos) > 0) {
                    return false;
                }
                boxes[index] |= pos;
            }
        }
        return true;
    }
}
