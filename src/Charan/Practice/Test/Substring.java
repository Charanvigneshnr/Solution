package Charan.Practice.Test;

import java.util.ArrayList;

public class Substring {
    public static void main(String[] args) {
        ArrayList<Integer> result = isRotated("samplesamplesample", "");
        System.out.println(result);
        System.out.println("Number of occurences: " + result.size());
    }

    private static ArrayList<Integer> isRotated(String a, String b) {
//        a = strCpyCat(a);
        ArrayList<Integer> result = new ArrayList<>();
        int i, len = a.length();
        for (i = 0; i < len; i++) {
            if (a.charAt(i) == b.charAt(0)) {
                if (isSubstring(a, b, i)) {
                    result.add(i);
                }
            }
        }
        return result;
    }

    private static boolean isSubstring(String a, String b, int i) {
        int j = 0;
        while (j < b.length()) {
            if (a.charAt(i) != b.charAt(j)) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }

    public static String strCpyCat(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            sb.append(s.charAt(i));
        }
        for (int i = 0; i < len; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}