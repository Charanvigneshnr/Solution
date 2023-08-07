//9. 3Sum
package Charan.Blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeeSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(arr);
        for (List<Integer> list : result) {
            System.out.println(Arrays.toString(list.toArray()));
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> result = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        int i, sum, left, right, len = nums.length, temp;
        for (i = 0; i < len - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                temp = nums[i];
                left = i + 1;
                right = len - 1;
                while (left < right) {
                    sum = temp + nums[left] + nums[right];
                    if (sum == 0) {
                        arr.add(temp);
                        arr.add(nums[left]);
                        arr.add(nums[right]);
                        result.add(new ArrayList<>(arr));
                        arr.clear();
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    } else if (sum > 0) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }
        return result;
    }
}
/*
Idea:
1. The code sorts the input array,
2. Use a nested loop to iterate through all possible pairs of elements, with the third element
 being the complement of the sum of the first two.
3. It uses two pointers to traverse the remaining part of the array and find the complement.
4. When a valid triplet is found, it adds it to the result list.
5. The code has been corrected to handle duplicates and edge cases.
 */