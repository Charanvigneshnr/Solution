package Charan.KunalDSA;

public class Recursion {
    public static void main(String[] args) {
        recursion(4, 4);
    }

    public static void recursion(int r, int c) {
        if (r == 0) {
            return;
        }
        if (r < c) {
            System.out.print("*");
            recursion(r + 1, c);
        } else {
            System.out.println();
            recursion(0, c - 1);
        }
    }
}
