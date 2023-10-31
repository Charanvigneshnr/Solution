package Charan.Test;

public class Patterns {
    public static void main(String[] args) {
        pattern(4);
    }

    public static void pattern(int n) {
        int i, j;
        for (i = 1; i < 2 * n; i++) {
            for (j = 1; j < 2 * n; j++) {
                System.out.print(getVal(n, i, j) + " ");
            }
            System.out.println();
        }
    }

    private static int getVal(int n, int i, int j) {
        return n - Math.min(Math.min(i, j), Math.min(2 * n - i, 2 * n - j)) + 1;
    }
}