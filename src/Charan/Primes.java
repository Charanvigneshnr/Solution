package Charan;
public class Primes {
    public boolean CheckPrime(int num) {
        boolean isPrime = true;
        if (num < 2) {
            isPrime = false;
        }
        if (num == 2 || num == 3) {
            isPrime = true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            isPrime = false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}