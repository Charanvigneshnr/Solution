package Charan.LeetCode;
public class MinimumInsertions {
    class Solution {
        public int MinInsertions(String s) {
            int n = s.length();
            LongestPalindromicSubsequence lp = new LongestPalindromicSubsequence();
            return n-lp.LongestPalindromicSubsequence(s);
        }
    }
}
