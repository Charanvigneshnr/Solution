package Charan.LeetCode;

import org.jetbrains.annotations.NotNull;

public class RotateArray {
    public void RotateArray(int @NotNull [] nums, int k) {
        int len = nums.length;
        int i, j, l, p = 0;
        if (k > len) {
            k = k % len;
        }
        int[] arr = new int[k];
        int newLen = k;

        // For getting the last K elements from nums to arr, reverse access
        for (i = len - k; i < len; i++) {
            arr[p] = nums[i];
            p++;
        }

        // For shifting the existing elements in nums, reverse access
        for (j = (len - newLen - 1); j >= 0; j--) {
            nums[j + newLen] = nums[j];
        }

        // For replacing the remaining elements in nums from arr, forward access
        for (l = 0; l < newLen; l++) {
            nums[l] = arr[l];
        }
    }
}
