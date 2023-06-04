package Charan.LeetCode;

import org.jetbrains.annotations.NotNull;

public class SearchRange {
    public int[] searchRange(int @NotNull [] arr, int target) {
        int[] res = {-1, -1};
        res[0] = search(arr, target, true);
        res[1] = search(arr, target, false);
        return res;
    }

    public int search(int @NotNull [] arr, int target, boolean first) {
        int ans = -1;
        int low = arr[0];
        int high = arr[arr.length - 1];
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (first) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return ans;
    }
}
