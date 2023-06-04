package Charan.LeetCode;

import org.jetbrains.annotations.NotNull;

public class FindPeakElement {
    public int FindPeakElement(int @NotNull [] nums) {
//        Arrays.sort(nums);
        int max = 0;
        int i;
        int len = nums.length;
        for (i = 1; i < len - 1; i++) {
            if (nums[i] > nums[i - 1]) {
                if (nums[i] > nums[i + 1]) {
                    max = i;
                }
            }
        }
        return max;
    }
}
