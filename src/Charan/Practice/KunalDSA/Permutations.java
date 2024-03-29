package Charan.Practice.KunalDSA;

import org.jetbrains.annotations.NotNull;

public class Permutations {
    public static void main(String[] args) {
        Permutations("", "abc");
    }

    public static void Permutations(@NotNull String p, @NotNull String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            Permutations(f + ch + s, up.substring(1));
        }

    }
}
