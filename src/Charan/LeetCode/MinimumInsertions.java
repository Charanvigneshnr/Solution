package Charan.LeetCode;

import org.jetbrains.annotations.NotNull;

public class MinimumInsertions {
    public int MinimumInsertions(@NotNull String s) {
        int n = s.length();
        LongestPalindromicSubsequence lp = new LongestPalindromicSubsequence();
        return n - lp.LongestPalindromicSubsequence(s);
    }
}
