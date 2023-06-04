package Charan.KunalDSA;

import org.jetbrains.annotations.NotNull;

public class Recursion {
    public static void main(String[] args) {
        recursion("", "bccadae");
    }

    public static void recursion(String r, @NotNull String c) {
        if (c.isEmpty()) {
            System.out.println(r);
            return;
        }
        char ch = c.charAt(0);
        if (c.charAt(0) == 'a') {
            recursion(r, c.substring(1));
        } else {
            recursion(r + ch, c.substring(1));
        }
    }
}
