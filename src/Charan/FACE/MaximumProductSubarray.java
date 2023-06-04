package Charan.FACE;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

//Maximum Product Subarray
public class MaximumProductSubarray {
    public static int MaximumProductSubarray(int @NotNull [] arr) {
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        int product = 1;
        for (int i = 0; i < n; i++) {
            product *= arr[i];
            ans = Math.max(ans, product);
            if (arr[i] == 0) {
                product = 1;
            }
        }
        product = 1;
        for (int i = n - 1; i >= 0; i--) {
            product *= arr[i];
            ans = Math.max(ans, product);
            if (arr[i] == 0) {
                product = 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum Subarray product is " + MaximumProductSubarray(arr));
    }
}
