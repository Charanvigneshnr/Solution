//1. Two Sum
package Charan.Blind75;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3};
        int target = 4;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i, len = arr.length;
        for (i = 0; i < len; i++) {
            if (!map.containsKey(target - arr[i])) {
                map.put(arr[i], i);
            } else {
                return new int[]{map.get(target - arr[i]), i};
            }
        }
        return new int[]{-1, -1};
    }
}

/*
Idea:
1. Create an emmpty hashmap
2. Iterate over the array
3. If the map doesn't contain this (target-arr[i]) then added the arr[i] to the map
4. Else return (target-arr[i], i)
*/