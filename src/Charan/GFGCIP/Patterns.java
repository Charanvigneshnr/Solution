package Charan.GFGCIP;

public class Patterns {
    public static void main(String[] args) {
        Patters(5);
        /*
         *
         ***
         *****
         *******
         */
    }

    public static void Patters(int n) {
        int i, j, k;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < (2 * (n - j)) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
