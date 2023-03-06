package Charan.LeetCode;

import java.util.ArrayList;
import java.util.List;
//Time Limit Exceeded
public class MaxSubArray
{
    public int MaxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int len = nums.length;
        int i,j,k;
        int temp=0;
        List<Integer> inner = new ArrayList<Integer>();
        for (i=0;i<len;i++)
        {
            for (j=i;j<len;j++)
            {
                for (k=i; k<=j; k++)
                {
                    inner.add(nums[k]);
                    temp+=nums[k];
                }
                if (temp>max)
                {
                    max=temp;
                }
                temp=0;
            }
        }
        return max;
    }
}
