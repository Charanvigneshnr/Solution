package Charan.LeetCode;


import org.jetbrains.annotations.NotNull;

public class LongestPalindromicSubsequence {
    public int LongestPalindromicSubsequence(@NotNull String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        LongestCommonSubsequence l = new LongestCommonSubsequence();
        return l.LongestCommonSubsequence(s, reverse);
    }
}
