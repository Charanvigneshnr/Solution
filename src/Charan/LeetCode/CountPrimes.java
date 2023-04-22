package Charan.LeetCode;

import java.util.Arrays;

public class CountPrimes {
    public int CountPrimes(int n) {
        if (n <= 2) return 0;
        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        int count = 0;
        for (int i = 2; i*i <= n; i++) {
            if (primes[i]) {
                for (int j = i*i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (primes[i]) count++;
        }
        return count;
    }

}