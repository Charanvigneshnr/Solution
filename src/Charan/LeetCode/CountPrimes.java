package Charan.LeetCode;

import java.util.Arrays;

public class CountPrimes {
    public int CountPrimes(int n) {
        if (n <= 2) return 0;
        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        int i,j,len = (int) Math.sqrt(n) + 1, count = 0;
        // Iterate over all numbers from 2 to the square root of n.
        // For each number i, if it is prime (i.e., primes[i] is true),
        // set all multiples of i (i.e., primes[j] where j is a multiple of i) to false.
        for (i = 2; i*i <= n; i++) {
            if (primes[i]) {
                count++;
                for (j = i*i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }

        for (i = len; i < n; i++) {
            if (primes[i]) count++;
        }
        return count;
    }
}