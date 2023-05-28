package Charan.KunalDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static List<Integer> CyclicSort(int[] arr) {
        int len = arr.length;
        int i = 0;
        int correct, temp;
        while (i < len) {
            correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (i = 0; i < len; i++) {
            if (arr[i] != i + 1) {
                res.add(i);
            }
        }
        return res;
    }
}
