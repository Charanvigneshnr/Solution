package Charan;

public class Palindrome {
    public boolean isPalindrome(String str) {
        boolean result = false;
        if (str == null || str.length() == 0) {
            result = false;
        }
        char[] chars = str.toLowerCase().toCharArray();
        int len = chars.length;
        if (len == 1) {
            result = true;
        }
        else if (len == 2) {
            if (chars[0] == chars[1]) {
                result = true;
            }
        }
        else {
            int i;
            for (i = len - 1; i > len / 2; i--) {
                if (chars[i] == chars[len - i - 1]) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
