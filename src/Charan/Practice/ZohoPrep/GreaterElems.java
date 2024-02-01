package Charan.Practice.ZohoPrep;

public class GreaterElems {
    public static void main(String[] args) {
        System.out.println(reverseStr("Hellooo, World! What's cookin'?"));
        System.out.println(isSubStr("Hello World", "erl"));
        System.out.println(countSubstrings("hello world this is an worst world because i am put to hell in this world", "hell"));
    }

    public static int countSubstrings(String s, String subStr) {
        int subLen = subStr.length();
        int len = s.length();
        int count = 0;
        for (int i = 0; i <= len - subLen; i++) {
            if (isSubStr(s.substring(i, i + subLen), subStr)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isSubStr(String s, String subStr) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == subStr.charAt(count)) {
                count++;
            } else {
                count = 0;
            }
            if (count == subStr.length()) {
                return true;
            }
        }
        return false;
    }

    public static String reverseStr(String s) {
        char[] arr = s.toCharArray();
        int len = s.length();
        int left = 0;
        int right = len - 1;
        while (left < right) {
            if (!Character.isAlphabetic(arr[left]))
                left++;
            else if (!Character.isAlphabetic(arr[right]))
                right--;
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}
