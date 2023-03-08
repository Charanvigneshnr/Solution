package Charan.LeetCode;

import java.util.BitSet;

public class CountPrimes {
    public int CountPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        // initialize a BitSet with all bits set to true
        BitSet primes = new BitSet(n);
        primes.set(2, n);

        // mark all multiples of prime numbers as non-prime
        for (int i = 2; i * i < n; i++) {
            if (primes.get(i)) {
                for (int j = i * i; j < n; j += i) {
                    primes.clear(j);
                }
            }
        }

        // count the number of prime numbers in the BitSet
        return primes.cardinality();
    }
}

