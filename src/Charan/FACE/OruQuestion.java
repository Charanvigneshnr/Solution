package Charan.FACE;

import java.util.Scanner;

public class OruQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int i, j;
        for (i = 0; i < n; i++) {
            System.out.print("Array 1: ");
            arr1[i] = sc.nextInt();
            System.out.print("Array 2: ");
            arr2[i] = sc.nextInt();
        }
        boolean flag = false;
        int mod = arr1[0] + arr2[0];
        int result = 0;
        for (i = mod; i < Integer.MAX_VALUE && !flag; i += 3) {
            for (j = 0; j < n; j++) {
                if (!((i) % arr1[j] == arr2[j])) {
                    break;
                }
                if (j == n - 1) {
                    flag = true;
                }
            }
            result = i;
        }
        System.out.println(result);
    }
}
