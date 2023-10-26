package Charan.Test;

import java.util.Map;
import java.util.TreeMap;

public class LabRat {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 5, 3, 2, 6, 7, 8};
        int[] a2 = {4, 2, 3, 5, 4, 7, 9, 1};
        int[] arr = new int[a1.length + a2.length];
        System.arraycopy(a1, 0, arr, 0, a1.length);
        System.arraycopy(a2, 0, arr, a1.length, a2.length);
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map);
    }
}
