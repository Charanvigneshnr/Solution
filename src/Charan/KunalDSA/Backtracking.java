package Charan.KunalDSA;

import org.jetbrains.annotations.NotNull;

public class Backtracking {
    public static void main(String[] args) {
        boolean[][] matrix = {{true, true, true}, {true, true, true}, {true, true, true}};
        totalPath("", matrix, 0, 0);
    }

    public static void totalPath(String p, boolean[] @NotNull [] arr, int r, int c) {
        if (r == arr.length - 1 && c == arr[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!arr[r][c]) {
            return;
        }
        arr[r][c] = false;
        if (r < arr.length - 1) {
            totalPath(p + "D ", arr, r + 1, c);
        }
        if (c < arr[0].length - 1) {
            totalPath(p + "R ", arr, r, c + 1);
        }
        if (r > 0) {
            totalPath(p + "U ", arr, r - 1, c);
        }
        if (c > 0) {
            totalPath(p + "L ", arr, r, c - 1);
        }
        arr[r][c] = true;
    }
}
