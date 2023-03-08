package Charan.PrintAlphabets;

public class C {
    static void LetterC(String s, int len) {
        System.out.println("\nPrinting " + s + " in the pattern C\n");
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();
        for (int i = len - 2; i > 0; i--) {
            System.out.println(s.charAt(i));
        }
        for (int i = 0; i < len; i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println("\n\nPattern C Printed");
    }
}