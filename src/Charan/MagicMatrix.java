package Charan;

public class MagicMatrix {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        matrix[0][n / 2] = 1;
        int i = 0, j = n / 2;
        int count = 1;
        for (i = 0; i < n * n; i++) {
            i--;
            j++;
            count++;
            if (i == -1 && j == n) {
                matrix[i + 1][j - 1] = count;
                i = i + 1;
                j = j - 1;
            } else if (i == -1) {
                matrix[0][n - 1] = count;
                i = 0;
                j = n - 1;
            } else if (j == n) {
                matrix[i - 1][0] = count;
                i = i - 1;
                j = 0;
            } else if (matrix[i][j] != 0) {
                matrix[i + 2][j - 1] = count;
                i = i + 2;
                j = j - 1;
            }
        }
        return matrix;
    }
}
//Program to find in the given number which is max and min without using any looping and conditions.