package Charan.Practice.KunalDSA;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Backtracking {
    public static void main(String[] args) {
        boolean[][] matrix = {{true, true, true}, {true, true, true}, {true, true, true}};
        int[][] path = new int[matrix.length][matrix[0].length];
        totalPath("", matrix, 0, 0, path, 1);
    }

    public static void totalPath(@NotNull String p, boolean[] @NotNull [] arr, int r, int c, int[] @NotNull [] path, int step) {
        if (r == arr.length - 1 && c == arr[0].length - 1) {
            path[r][c] = step;
            for (int[] mat : path) {
                System.out.println(Arrays.toString(mat));
            }
            System.out.println("Path: " + p.substring(0, p.length() - 2));
            System.out.println();
            return;
        }
        if (!arr[r][c]) {
            return;
        }
        arr[r][c] = false;
        path[r][c] = step;
        if (r < arr.length - 1) {
            totalPath(p + "D->", arr, r + 1, c, path, step + 1);
        }
        if (c < arr[0].length - 1) {
            totalPath(p + "R->", arr, r, c + 1, path, step + 1);
        }
        if (r > 0) {
            totalPath(p + "U->", arr, r - 1, c, path, step + 1);
        }
        if (c > 0) {
            totalPath(p + "L->", arr, r, c - 1, path, step + 1);
        }
        arr[r][c] = true;
        path[r][c] = 0;
    }
}
