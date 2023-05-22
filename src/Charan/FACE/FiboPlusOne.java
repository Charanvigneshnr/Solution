package Charan.FACE;

public class FiboPlusOne {
    public int FiboPlusOne(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRecursive(n + 1);
    }

    private int fibRecursive(int n) {
        if (n <= 0) {
            return 0;
        } else if (n <= 2) {
            return 1;
        }
        return fibRecursive(n - 1) + fibRecursive(n - 2) + fibRecursive(n - 3);
    }


//        n = n + 1;
//        int[] arr = new int[n + 1];
//        arr[0] = 0;
//        arr[1] = 1;
//        arr[2] = 1;
//        int i;
//        for (i = 3; i <= n; i++) {
//            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
//        }
//        return arr[n];
}
