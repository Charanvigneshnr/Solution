//6. Maximun Product Subarray
package Charan.Blind75;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        System.out.println(maxProduct(arr));
    }

    public static int maxProduct(int[] arr) {
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
}

/*
Idea:
1. Traverse the array left to right once and get the max product
2. Traverse the array right to left once and get the max product
*/