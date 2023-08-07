package Charan.Blind75;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(nums, 6));
    }

    public static int search(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] == target)
                return 0;
            else
                return -1;
        }
        int left = 0, right = nums.length - 1;
        while (right >= left) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[left] <= nums[mid] && nums[left] <= target && target < nums[mid]) {
                right = mid - 1;
            } else if (nums[mid] <= nums[right] && nums[mid] < target && target <= nums[right]) {
                left = mid + 1;
            } else if (nums[left] > nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
/*
Idea:
1. If we find the target, return the index
2. If the left half is sorted and the target is in that half, right = mid - 1
3. If the right half is sorted and the target is in that half, left = mid + 1
4. If the left half is not sorted, search the right half, right = mid - 1
5. If the right half is not sorted, search the left half, left = mid + 1
 */