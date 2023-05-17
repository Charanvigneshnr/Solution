package Charan.LeetCode;

import java.util.Arrays;

public class SuccessfulPairs {
    public int[] SuccessfulPairs(int[] spells, int[] potions, long success) {
        int len1 = spells.length;
        int len2 = potions.length;
        int[] result = new int[len1];

        Arrays.sort(potions);

        for (int i = 0; i < len1; i++) {
            int low = 0, high = len2 - 1, mid;
            while (low <= high) {
                mid = low + (high - low) / 2;
                if ((long) spells[i] * potions[mid] >= success) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            result[i] = len2 - low;
        }
        return result;
    }
}
