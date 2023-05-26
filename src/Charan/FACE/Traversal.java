package Charan.FACE;

import java.util.Scanner;

public class Traversal {
    public static int calculateNumber(int i, int j, int row, int col) {
        return i * row + col + 1;
    }

    public static void main(String[] args) {
        int ROW = 3;
        int COL = 3;
        int[][] arr = new int[3][3];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                arr[i][j] = s.nextInt();
                if (i == 0 && j != 0)
                    arr[i][j] += arr[i][j - 1];
                else if (j == 0 && i != 0)
                    arr[i][j] += arr[i - 1][j];
                else if (i > 0 && j > 0)
                    arr[i][j] += Math.min(arr[i][j - 1], Math.min(arr[i - 1][j - 1], arr[i - 1][j]));
            }
        }
        System.out.println(arr[ROW - 1][COL - 1]);
    }
}
/*
6-9
4-6
9-14
*/
