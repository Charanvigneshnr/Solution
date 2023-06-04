package Charan.KunalDSA;

import org.jetbrains.annotations.NotNull;

public class InfiniteBinarySearch {
    public static int result(int @NotNull [] arr, int target) {
        int start = 0;
        int end = 1;
        int result = 0;
        while (target > arr[end]) {
            int nStart = end + 1;
            end = end * (start + (end - start + 1)) * 2;
            start = nStart;
        }
        return infiniteBinarySearch(arr, target, start, end);
    }

    public static int infiniteBinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
