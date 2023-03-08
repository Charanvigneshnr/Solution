package Charan.PrintAlphabets;

public class O {
    static void LetterO(String s, int len) {
        System.out.println("\nPrinting " + s + " in the pattern O\n");
        String space = "";
        for (int i = 1; i < len - 1; i++) {
            space += " ";
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == 0) {
                    System.out.print(s.charAt(j));
                } else if (i == len - 1) {
                    System.out.print(s.charAt(len - 1 - j));
                }
//                else
//                {
//                    System.out.print(s.charAt(i)+space+s.charAt(len-1-i));
//                }
            }
            System.out.print(s.charAt(i) + space + s.charAt(len - 1 - i));
            System.out.println();
        }
        System.out.println("\nPattern O Printed");
    }
}
