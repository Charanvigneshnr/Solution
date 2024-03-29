package Charan.LeetCode;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    static @NotNull Boolean checkAnagram(@NotNull String s, @NotNull String t) {
        int len1 = s.length();
        int len2 = t.length();
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        boolean flag = false;
        if (len1 == len2) {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            flag = Arrays.equals(arr1, arr2);
        }
        return flag;
    }

    public @NotNull List<List<String>> groupAnagrams(String @NotNull [] strs) {
        List<List<String>> outerList = new ArrayList<>();
        List<String> innerList = new ArrayList<>();
        int i;
        int j;
        int len = strs.length;
        for (i = 0; i < len - 1; i++) {
            for (j = i + 1; j < len; j++) {
                if ((!checkAnagram(strs[i], strs[j])) && j == len - 1) {
                    innerList.add(strs[i]);
                    outerList.add(innerList);
                    break;
                } else if (checkAnagram(strs[i], strs[j])) {
                    innerList.add(strs[j]);
                }
            }
            outerList.add(innerList);
        }
        return outerList;
    }
}
