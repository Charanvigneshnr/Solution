package Charan.KunalDSA;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static int[] mergeSort(int @NotNull [] arr) {
        int len = arr.length;
        if (len == 1) {
            return arr;
        }
        int mid = len / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, len));
        return merge(left, right);
    }

    private static int[] merge(int @NotNull [] first, int @NotNull [] second) {
        int len = first.length + second.length;
        int firstLen = first.length;
        int secondLen = second.length;
        int[] arr = new int[len];
        int i = 0, j = 0, k = 0;
        while (i < firstLen && j < secondLen) {
            if (first[i] < second[j]) {
                arr[k++] = first[i++];
            } else {
                arr[k++] = second[j++];
            }
        }
        while (i < firstLen) {
            arr[k++] = first[i++];
        }
        while (j < secondLen) {
            arr[k++] = second[j++];
        }
        return arr;
    }
}
