//10. Container With Most Water
package Charan.Blind75;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] height) {
        int temp, left, right, len = height.length;
        int result = Integer.MIN_VALUE;
        left = 0;
        right = len - 1;
        while (left < right) {
            temp = Math.min(height[left], height[right]) * (right - left);
            result = Math.max(result, temp);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}
/*
Idea:
1. Two pointer approach
2. Take the min of left and right and calculate current area using the min value and (right - left)
3. Update the max area if the current area is greater than the max area
4. If arr[left]<arr[right] ? left+++ : right--
 */