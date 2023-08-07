//7. Find Minimum In Rotated Sorted Array
package Charan.Blind75;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {

    }

    public static int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int left = 0, right = nums.length - 1;
        if (nums[right] > nums[0]) {
            return nums[0];
        }
        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }
            if (nums[mid] > nums[0]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return Integer.MAX_VALUE;
    }
}
/*
Idea:
1. Basic binary search
2. mid elem > mid+1 elem ? return mid+1 elem
3. mid-1 elem > mid elem ? return mid elem
4. If mid elem > left ? left = mid + 1
5. If mid elem < right? right = mid - 1
 */