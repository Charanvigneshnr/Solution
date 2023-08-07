package Charan.Test;

import java.util.Arrays;

public class AnotherVictim {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 4, 0, 7, 8, 0};
        System.out.println(Arrays.toString(moveZeroes(arr)));
    }

    public static int[] moveZeroes(int[] nums) {
        int len = nums.length;
        int x = 0;
        int y = 0;
        int temp = 0;
        if (len == 0 || len == 1) {
            return new int[]{-1};
        }
        while (y < len) {
            if (nums[y] == 0) {
                y++;
            } else {
                temp = nums[x];
                nums[x] = nums[y];
                nums[y] = temp;
                x++;
                y++;
            }
        }
        return nums;
    }
}
