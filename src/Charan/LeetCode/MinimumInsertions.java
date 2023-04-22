package Charan.LeetCode;
public class MinimumInsertions {
        public int MinimumInsertions(String s) {
            int n = s.length();
            LongestPalindromicSubsequence lp = new LongestPalindromicSubsequence();
            return n-lp.LongestPalindromicSubsequence(s);
        }
}
