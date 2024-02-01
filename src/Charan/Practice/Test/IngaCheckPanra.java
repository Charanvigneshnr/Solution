package Charan.Practice.Test;

import java.util.HashMap;
import java.util.Map;

public class IngaCheckPanra {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3, 4, 2, 3, 1, 5};
        int[] freq = new int[6];
        int i;
        //Arrays.fill(freq, 1);
        int len = arr.length;
        for (i = 0; i < len; i++) {
            freq[arr[i]] += 1;
        }
        System.out.println("Using Normal Arrays");
        System.out.println("K:V");
        for (i = 1; i < freq.length; i++) {
            System.out.println(i + ":" + freq[i]);
        }
        System.out.println("\nUsing HashMap");
        freq(arr);
    }

    public static void freq(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i;
        int len = arr.length;
        for (i = 0; i < len; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println("K:V");
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            System.out.println(it.getKey() + ":" + it.getValue());
        }
    }
}
