package Charan.LeetCode;

public class RotateFunction
{
    public int RotateFunction(int[] nums)
    {
        int len = nums.length;
        int sum=0, sum1=0, ans=0;
        for(int i=0; i<len; i++){
            sum+=nums[i];
            sum1+=(i*nums[i]);
        }
        ans=sum1;
        for(int i=len-1; i>=0; i--){
            sum1+=sum-(nums[i]*len);
            ans=Math.max(ans, sum1);
        }
        return ans;
    }
}
