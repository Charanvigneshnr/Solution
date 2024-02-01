package Charan.Practice.Test;

public class Practice {
    public static void main(String[] args) {
        pattern(6, 7);
    }

    public static void pattern(int n, int m) {
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(getVal(m, n, i, j) + " ");
            }
            System.out.println();
        }
    }

    private static char getVal(int m, int n, int i, int j) {
        int x = n - Math.min(Math.min(i, j), Math.min(m - i - 1, n - j - 1));
        return x % 2 == 0 ? 'X' : 'O';
    }
}