package Charan;

import java.util.Arrays;

public class LabRat {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        for (int[] row : matrix) {
            Arrays.fill(row, 0);
        }

        matrix[0][n / 2] = 1;
        int i = 0;
        int j = n / 2;
        int count = 2;

        for (int num = 2; num <= n * n; num++) {
            int newI = (i - 1 + n) % n;
            int newJ = (j + 1) % n;

            if (matrix[newI][newJ] == 0) {
                i = newI;
                j = newJ;
            } else {
                i = (i + 1) % n;
            }

            matrix[i][j] = num;
        }

        return matrix;
    }
}
