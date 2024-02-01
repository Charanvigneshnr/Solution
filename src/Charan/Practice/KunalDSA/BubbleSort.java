package Charan.Practice.KunalDSA;

import org.jetbrains.annotations.NotNull;

public class BubbleSort {
    public void BubbleSort(int @NotNull [] arr) {
        int len = arr.length;
        int i, j, temp;
        boolean flag = false;
        for (i = 0; i < len - 1; i++) {
            for (j = 1; j < len - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }
}
