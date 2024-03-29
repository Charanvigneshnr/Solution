package Charan.FACE;

public class Totient {
    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static int phi(int n) {
        int result = 1;
        for (int i = 2; i < n; i++)
            if (gcd(i, n) == 1)
                result++;
        return result;
    }

    public static void main(String[] args) {
        int n = 50;
        for (int i = 0; i <= n; i++) {
            System.out.printf("Phi(%d) is: %d\n", i, phi(i));
        }
    }
}
