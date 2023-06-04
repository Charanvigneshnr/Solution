package Charan.KunalDSA;

import org.jetbrains.annotations.NotNull;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(isSorted(arr, 0));
    }

    private static boolean isSorted(int @NotNull [] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] <= arr[index + 1] && isSorted(arr, index + 1);
    }
}
