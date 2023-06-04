package Charan.KunalDSA;

import org.jetbrains.annotations.NotNull;

public class SelectionSort {
    public void SelectionSort(int @NotNull [] arr) {
        int len = arr.length;
        int i, maxIndex, last = len - 1;
        for (i = 0; i < len; i++) {
            maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
            last--;
        }
    }

    public void swap(int @NotNull [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int getMaxIndex(int[] arr, int start, int end) {
        int maxIndex = start;
        int i;
        for (i = start; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
