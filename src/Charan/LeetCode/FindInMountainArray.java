package Charan.LeetCode;

import org.jetbrains.annotations.NotNull;

interface MountainArray {
    int get(int index);

    int length();
}

public class FindInMountainArray {
    public int FindInMountainArray(@NotNull MountainArray mountainArr, int target) {
        int peak = peakElement(mountainArr);
        int firstTry = orderAgnosticBS(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        } else {
            return orderAgnosticBS(mountainArr, target, peak + 1, mountainArr.length() - 1);
        }
    }

    public int peakElement(@NotNull MountainArray mountainArr) {
        int low = 0;
        int high = mountainArr.length() - 1;
        int mid = 0;
        while (low <= high) {
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            mid = low + (high - low) / 2;
        }
        return low;
    }

    public int orderAgnosticBS(@NotNull MountainArray mountainArr, int target, int start, int end) {
        boolean ascending = mountainArr.get(start) < mountainArr.get(end);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midElement = mountainArr.get(mid);
            if (midElement == target) {
                return mid;
            }
            if (ascending) {
                if (midElement > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (midElement < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
