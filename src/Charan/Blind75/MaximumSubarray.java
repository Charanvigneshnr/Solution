//5. Maximum Subarray
package Charan.Blind75;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubarray(arr));
    }

    public static int maxSubarray(int[] arr) {
        int i, len = arr.length, prefix = 0;
        int result = arr[0];
        for (i = 0; i < len; i++) {
            if (prefix < 0) {
                prefix = 0;
            }
            prefix += arr[i];
            result = Math.max(result, prefix);
        }
        return result;
    }
}

/*
Idea:
1. Create a result variable and assign it to the first element of the array
2. Iterate through the array
3. If the prefix is less than 0 then assign prefix = 0
4. Calculate the prefix value by adding the elements of the array to it
5. Return the maximum of result and prefix

Representation of the sliding window:
-2, 1, -3, 4, -1, 2, 1, -5, 4
| -1 | = 0
    | -2 | = 0
         |      6     |
                      | -5 | = 0
                          | 4 |
 */