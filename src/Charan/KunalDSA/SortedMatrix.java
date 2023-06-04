package Charan.KunalDSA;

import org.jetbrains.annotations.NotNull;

public class SortedMatrix {

    public int[] bs(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[mid][row] == target) {
                return new int[]{mid, row};
            } else if (matrix[mid][mid] > target) {
                cEnd = mid - 1;
            } else {
                cStart = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }

    public int[] searchMatrix(int[] @NotNull [] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        if (row == 1) {
            return bs(matrix, row, 0, col - 1, target);
        }
        int rStart = 0;
        int rEnd = row - 1;
        int cMid = col / 2;
        while (rStart < rEnd - 1) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            } else if (matrix[mid][cMid] > target) {
                rEnd = mid - 1;
            } else {
                rStart = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }
}
