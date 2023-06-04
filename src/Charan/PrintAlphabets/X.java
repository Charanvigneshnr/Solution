package Charan.PrintAlphabets;

import org.jetbrains.annotations.NotNull;

public class X {
    static void LetterX(@NotNull String s, int len) {
        System.out.println("\nPrinting " + s + " in the pattern X\n");
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if ((i == j) || (i + j == len - 1)) {
                    System.out.print(s.charAt(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\nPattern X Printed");
    }
}
