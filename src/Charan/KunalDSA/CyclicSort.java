package Charan.KunalDSA;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int CyclicSort(int @NotNull [] arr) {
        int len = arr.length;
        int i = 0;
        int correct, temp;
        while (i < len) {
            correct = arr[i];
            if (arr[i] > 0 && arr[i] < len && arr[i] != arr[correct]) {
                temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < len; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return -1;
    }
}
