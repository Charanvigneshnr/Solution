package Charan.Practice;

public class Solution {
    public static void main(String[] args) {
        lookAndSay(4);
    }

    public static void lookAndSay(int n) {
        if (n == 1) {
            System.out.println("1");
            return;
        }
        if (n == 2) {
            System.out.println("11");
            return;
        }
        System.out.println("1");
        System.out.println("11");
        String s = "11";
        for (int i = 3; i <= n; i++) {
            StringBuilder temp = new StringBuilder();
            int count = 1;
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(j - 1)) {
                    count++;
                } else {
                    temp.append(count).append(s.charAt(j - 1));
                    count = 1;
                }
            }
            temp.append(count).append(s.charAt(s.length() - 1));
            s = temp.toString();
            System.out.println(s);
        }
    }
}
