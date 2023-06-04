package Charan.LeetCode;

import org.jetbrains.annotations.NotNull;

public class CountAndSay {
    public @NotNull String count(String n) {
        if (n == "1") {
            return "1";
        }
        if (n == "2") {
            return "11";
        } else {
            String s = n;
            int cnt = 1;
            char ch = s.charAt(0);
            StringBuilder curr = new StringBuilder();
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == ch) {
                    cnt++;
                } else {
                    curr.append(cnt);
                    curr.append(ch);
                    ch = s.charAt(i);
                    cnt = 1;
                }
            }
            curr.append(cnt);
            curr.append(ch);
            return curr.toString();
        }
    }

    public String CountAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
            s = count(s);
        }
        return s;
    }
}
