package Charan.KunalDSA;

public class Prime {
    public static void main(String[] args) {
        int n = 40000;
        boolean[] arr = new boolean[n + 1];
        SieveOfEratosthenes(n, arr);
    }

    public static void SieveOfEratosthenes(int n, boolean[] arr) {
        for (int i = 2; i * i <= n; i++) {
            if (!arr[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    arr[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!arr[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
