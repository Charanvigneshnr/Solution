package Charan.LeetCode;


public class LongestPalindromicSubsequence {
    public int LongestPalindromicSubsequence(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        LongestCommonSubsequence l = new LongestCommonSubsequence();
        return l.LongestCommonSubsequence(s, reverse);
    }
}
