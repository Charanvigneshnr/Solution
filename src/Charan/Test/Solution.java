package Charan.Test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        String s = sc.next();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) res++;
            set.add(s.charAt(i));
        }
        if (res % 2 == 0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    }
}
