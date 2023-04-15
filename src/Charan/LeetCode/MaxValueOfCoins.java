package Charan.LeetCode;

import java.util.List;

public class MaxValueOfCoins
{
    public static int MaxValueOfCoins(List<List<Integer>> piles, int k) {
        int[] mv = new int[k + 1];
        int[] pileSum = new int[k + 1];
        for (List<Integer> pile : piles) {
            int n = Math.min(k, pile.size());
            int sum = 0;
            for (int i = 1; i <= n; i++)
                pileSum[i] = sum += pile.get(i - 1);
            for (int i = k; i > 0; i--) {
                int max = 0;
                for (int j = Math.min(i, n); j >= 0; j--)
                    max = Math.max(max, pileSum[j] + mv[i - j]);
                mv[i] = max;
            }
        }
        return mv[k];
    }
}

//        This code solves a problem of finding the maximum total number of coins that can be obtained from a given set of piles of coins, where at most k coins can be taken from each pile.
//        The input consists of a list of lists piles, where each inner list represents a pile of coins. The integer k specifies the maximum number of coins that can be taken from each pile.
//        The function maxValueOfCoins calculates the maximum number of coins that can be obtained by using a dynamic programming approach. It initializes two arrays, mv and pileSum, both of length k + 1.
//        The pileSum array keeps track of the sum of coins up to a certain index for each pile. For each pile, the sum is calculated up to the minimum of the size of the pile and the maximum number of coins k.
//        The mv array keeps track of the maximum total number of coins that can be obtained using up to i coins, where i ranges from 1 to k. The outer loop iterates over all the piles of coins. For each pile, the inner loop iterates over the mv array backwards from k to 1, and calculates the maximum number of coins that can be obtained using up to i coins from the current pile and the previously processed piles.
//        The maximum number of coins that can be obtained using up to i coins from the current pile and the previously processed piles is calculated by taking the maximum of the current sum of coins up to j from the current pile and the maximum value of coins that can be obtained using i - j coins from the previous piles.
//        Finally, the function returns the maximum total number of coins that can be obtained using up to k coins.