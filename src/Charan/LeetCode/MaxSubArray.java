package Charan.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class MaxSubArray
{
    public int MaxSubArray(int[] nums) {
        int sum = -999999;
        int max = -999999;
        int i = 0;
        for (i=0;i<nums.length;i++)
            {
            sum = Math.max(nums[i],nums[i]+sum);
            max = Math.max(max,sum);
        }
        return max;
    }
}
