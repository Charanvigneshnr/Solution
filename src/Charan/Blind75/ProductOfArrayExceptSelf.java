//4. Product of Array Except Self
package Charan.Blind75;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {-1, 1, 0, -3, 3};
        //int[] arr = {1, 2, 3, 4};

        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    public static int[] productExceptSelf(int[] arr) {
        int i, len = arr.length;
        int[] res = new int[len];
        int prefix = 1;
        int postfix = 1;
        for (i = 0; i < len; i++) {
            res[i] = prefix;
            prefix *= arr[i];
        }
        for (i = len - 1; i >= 0; i--) {
            res[i] *= postfix;
            postfix *= arr[i];
        }
        return res;
    }
}

/*
Idea:
1. Create the result array
2. In first traversal [0->n-1), put the prefix value in the output array and mulitply prefix with arr[i]
3. In second traversal [len-1->0], put the product of postfix and the output array and then multiply postfix with arr[i] and put it in postfix
 */