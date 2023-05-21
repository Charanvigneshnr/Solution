package Charan.FACE;

import java.util.Arrays;

public class LexicographicallyPalindrome {
    public boolean isLexicographicallyPalindrome(String s) {
        int len = s.length();
        int pos = len / 2;
        if (len % 2 != 0) {
            pos = len / 2 + 1;
        }
        boolean res = true;
        char[] s1 = new char[len / 2];
        for (int i = 0; i < len / 2; i++) {
            s1[i] = s.charAt(i);
        }
        Arrays.sort(s1);
        for (int i = 0; i < len / 2; i++) {
            s1[i] = s.charAt(pos + i);
        }
        Arrays.sort(s1);
        for (int i = 0; i < len / 2; i++) {
            if (s1[i] != s.charAt(i)) {
                res = false;
                break;
            }
        }
        return res;
    }
}