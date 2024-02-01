package Charan.Practice.ZohoPrep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByWeights {
    public static void main(String[] args) {
        sortWeights(new int[]{10, 36, 54, 89, 12});
    }

    public static void sortWeights(int[] arr) {
        int score = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            if (j % 2 == 0) {
                score += 2;
            }
            if (j % 4 == 0 && j % 6 == 0) {
                score += 4;
            }
            if (isSqrt(j)) {
                score += 5;
            }
            map.put(j, score);
            score = 0;
        }
        System.out.println(map);
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        System.out.println(list);
    }

    public static boolean isSqrt(int n) {
        int num = (int) Math.sqrt(n);
        return num * num == n;
    }
}
