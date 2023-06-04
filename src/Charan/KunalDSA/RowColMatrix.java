package Charan.KunalDSA;

import org.jetbrains.annotations.NotNull;

public class RowColMatrix {
    public int[] searchRow(int[] @NotNull @NotNull [] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return new int[]{-1, -1};
    }
}
