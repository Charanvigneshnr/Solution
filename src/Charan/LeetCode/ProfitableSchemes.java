package Charan.LeetCode;

public class ProfitableSchemes {
    public int ProfitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        // Define the method signature and input parameters

        int mod = (int) 1e9 + 7;
        // Define a variable to store the modulo value

        var memo = new int[n + 1][minProfit + 1];
        // Define a 2D array to store the memoized values

        memo[0][0] = 1;
        // Set the base case of the memoized array to be 1, since if we have 0 members and 0 profit, we can still have one scheme

        for (int k = 1; k <= group.length; k++) {
            // Loop through each crime k

            int g = group[k - 1], p = profit[k - 1];
            // Get the number of members required for the current crime g and the profit for the current crime p

            for (int i = n; g <= i; i--) { // i: n -> g
                // Loop through each possible number of members i, starting from n and going down to g

                for (int j = minProfit; 0 <= j; j--) { // j: minProfit -> 0
                    // Loop through each possible profit j, starting from minProfit and going down to 0

                    memo[i][j] = (memo[i][j] + memo[i - g][Math.max(0, j - p)]) % mod;
                    // Calculate the number of schemes with the current number of members i and the current profit j by adding the number of schemes without the current crime (memo[i][j]) and the number of schemes with the current crime (memo[i - g][Math.max(0, j - p)]) using the knapsack algorithm

                }
            }
        }

        var ans = 0;
        // Define a variable to store the final answer

        for (int i = 0; i <= n; i++) {
            ans = (ans + memo[i][minProfit]) % mod;
            // Calculate the total number of schemes by summing up the number of schemes with the minimum profit requirement for all possible numbers of members i
        }

        return ans;
        // Return the final answer
    }

}
