//3. Contains Duplicate
package Charan.Blind75;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        int arrLen = nums.length;
        int i;
        Set<Integer> set = new HashSet<>();
        for (i = 0; i < arrLen; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}

/*
Idea:
1. Create a set
2. Iterate over the array
3. If the number is in the set, return true
 */