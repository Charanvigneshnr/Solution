//12. Count Bits
package Charan.Blind75;

import java.util.Arrays;

public class CountBits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(10)));
    }

    public static int[] countBits(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        int i;
        int offset = 1;
        for (i = 1; i <= n; i++) {
            if (offset * 2 == i) {
                offset = i;
            }
            dp[i] = 1 + dp[i - offset];
        }
        return dp;
    }
}
/*
    8  4  2  1     DP
0 = 0  0  0  0     1+dp[n-1]
1 = 0  0  0  1     1+dp[n-2]
2 = 0  0  1  0     1+dp[n-2]
3 = 0  0  1  1     1+dp[n-4]
4 = 0  1  0  0     1+dp[n-4]
5 = 0  1  0  1     1+dp[n-4]
6 = 0  1  1  0     1+dp[n-4]
7 = 0  1  1  1     1+dp[n-4]
8 = 1  0  0  0     1+dp[n-8]
 */