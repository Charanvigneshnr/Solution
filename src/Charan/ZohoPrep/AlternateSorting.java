package Charan.ZohoPrep;

import java.util.Arrays;

public class AlternateSorting {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(alternateSorting(new int[]{1, 2, 3, 4, 5, 6, 7})));
    }

    public static int[] alternateSorting(int[] arr) {
        int len = arr.length;
        int[] res = new int[len];
        int count = 0;
        for (int i = 0; i < len; i += 2) {
            res[i] = arr[len - count++ - 1];
        }
        count = 0;
        for (int i = 1; i < len - 1; i += 2) {
            res[i] = arr[count++];
        }
        return res;
    }
}
