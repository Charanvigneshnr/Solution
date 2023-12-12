package Charan.CodeForces;

import java.util.Scanner;

public class A514 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int len = String.valueOf(n).length();
        int[] arr = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            int last = (int) (n % 10);
            if (i == 0 && (last == 0 || last == 9)) arr[i] = last;
            else arr[i] = Math.min(9 - last, last);
            n /= 10;
        }
        long res = 0;
        for (int i = 0; i < len; i++) {
            res = res * 10 + arr[i];
        }
        System.out.println(res);
    }
}