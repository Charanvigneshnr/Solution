package Charan;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public int SieveOfEratosthenes(int num) {
        // create a boolean array to mark whether each number is prime or not
        boolean[] sieve = new boolean[num + 1];
        Arrays.fill(sieve, true);
        sieve[0] = false; // 0 is not a prime number
        sieve[1] = false; // 1 is not a prime number
        sieve[2] = true;  // 2 is a prime number
        int count = 1;    // initialize the count of primes to 1 (2 is already counted)
        int i, j;
        // loop through odd numbers up to the square root of num
        for (i = 3; i * i <= num; i += 2)
        {
            // if i is prime, mark all odd multiples of i as not prime
            if (sieve[i])
            {
                for (j = i * i; j <= num; j += 2 * i)
                {
                    sieve[j] = false;
                }
                count++;
            }
        }
        // count the number of primes among the remaining odd numbers
        for (; i <= num; i += 2)
        {
            if (sieve[i])
            {
                count++;
            }
        }
        return count;
    }
}