package Charan.PrintAlphabets;

public class L {
    static void LetterL(String s, int len) {
        System.out.println("\nPrinting " + s + " in the pattern L\n");
        for (int i = 0; i < len - 1; i++) {
            System.out.println(s.charAt(i));
        }
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println("\n\nPattern L Printed");
    }
}