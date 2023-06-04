package Charan.KunalDSA;

import org.jetbrains.annotations.NotNull;

public class NKnights {
    public static void main(String[] args) {
        int n = 3;
        boolean[][] board = new boolean[n][n];
        nKnights(board, 0, 0, n);
    }

    public static void nKnights(boolean[] @NotNull [] board, int row, int col, int n) {
        if (n == 0) {
            display(board);
            System.out.println();
            return;
        }
        if (col >= board.length) {
            nKnights(board, row + 1, 0, n);
            return;
        }
        if (row >= board.length) {
            return;
        }
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            nKnights(board, row, col + 1, n - 1);
            board[row][col] = false;
        }
        nKnights(board, row, col + 1, n);
    }

    private static boolean isSafe(boolean[] @NotNull [] board, int row, int col) {
        int[][] directions = {
                {-2, -1}, {-2, 1}, {-1, -2}, {-1, 2},
                {1, -2}, {1, 2}, {2, -1}, {2, 1}
        };

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (isValid(board, newRow, newCol) && board[newRow][newCol]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isValid(boolean[] @NotNull [] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }

    private static void display(boolean[] @NotNull [] board) {
        for (boolean[] row : board) {
            for (boolean b : row) {
                if (b) {
                    System.out.print("K ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
