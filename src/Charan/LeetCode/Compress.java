package Charan.LeetCode;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Compress {
    public int Compress(char @NotNull [] s) {
        Arrays.sort(s);
        List<String> list = new ArrayList<String>();
        int len = s.length;
        int i = 0;
        String target = Character.toString(s[i]);
        int count = 1;
        for (i = 1; i < len; i++) {
            if (Character.toString(s[i]).equals(target)) {
                count++;
            } else {
                list.add(target);
                list.add(Integer.toString(count));
                count = 1;
                target = Character.toString(s[i]);
            }
        }
        return list.size();
    }
}
