package Charan.KunalDSA;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {6, 5, 7, 6, 5, 8, 1, 2, 4, 0, 9, 3};
        SelectionSort ob = new SelectionSort();
        ob.SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
