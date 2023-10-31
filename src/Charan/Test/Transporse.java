package Charan.Test;

import java.util.Arrays;

public class Transporse {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(transpose(arr)[0]));
        System.out.println(Arrays.toString(transpose(arr)[1]));
        System.out.println(Arrays.toString(transpose(arr)[2]));
    }

    public static int[][] transpose(int[][] matrix) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        int[][] mat = new int[colLen][rowLen];
        for (int i = 0; i < rowLen; ++i) {
            for (int j = 0; j < colLen; ++j) {
                mat[i][j] = matrix[j][i];
            }
        }
        return mat;
    }
    
}
