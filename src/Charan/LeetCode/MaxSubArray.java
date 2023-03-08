package Charan.LeetCode;

public class MaxSubArray {
    public int MaxSubArray(int[] nums) {
        int sum = -999999;
        int max = -999999;
        int i;
        int len = nums.length;
        for (i = 0; i < len; i++) {
            sum = Math.max(nums[i], nums[i] + sum);
            max = Math.max(max, sum);
        }
        return max;
    }
}
