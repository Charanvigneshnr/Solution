package Charan.FACE;

public class NumberOfWays {
    public int NumberOfWays(int n) {
        if (n <= 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            int[][] arr = new int[n][n];
            int i, j;
            arr[0][0] = 1;
            for (i = 1; i < n; i++) {
                for (j = 0; j <= i; j++) {
                    if (j == 0) {
                        arr[i][j] = arr[i - 1][i - 1];
                    } else {
                        arr[i][j] = arr[i - 1][j - 1] + arr[i][j - 1];
                    }
                }
            }
            return arr[n - 1][n - 1];
        }
    }
}
