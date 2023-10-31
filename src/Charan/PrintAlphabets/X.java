package Charan.PrintAlphabets;

public class X {
    public static void main(String[] args) {
        LetterX("PROGRAM");
    }

    static void LetterX(String s) {
        int len = s.length();
        System.out.println("\nPrinting " + s + " in the pattern X\n");
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == j) {
                    System.out.print(s.charAt(i));
                } else if (i + j == len - 1) {
                    System.out.print(s.charAt(len - 1 - i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\nPattern X Printed");
    }
}
