package Charan.FACE;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;

public class ClimbingLeaders {
    public static void main(String[] args) {
        ClimbingLeaders climbingLeaders = new ClimbingLeaders();
        int[] arr = {16, 17, 4, 3, 5, 2};
        int[] res = climbingLeaders.ClimbingLeaders(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public int[] ClimbingLeaders(int @NotNull [] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int len = arr.length;
        list.add(arr[len - 1]);
        int i;
        int tempMax = arr[len - 1];
        for (i = len - 1; i > 0; i--) {
            if (tempMax < arr[i - 1]) {
                list.add(arr[i - 1]);
                tempMax = arr[i - 1];
            }
        }
        Collections.reverse(list);
        int[] res = list.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }
}
