package Charan.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestNumberOfCandies {
    public List<Boolean> KidsWithCandies(int[] candies, int extraCandies) {
        int len = candies.length;
        ArrayList<Boolean> list = new ArrayList<>();
        int i;
        int target = Arrays.stream(candies).max().getAsInt();;
        for (i = 0; i < len; i++) {
            if (candies[i] + extraCandies>=target)
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
        }
        return list;
    }
}
