package Charan.ZohoPrep;

import java.util.Stack;

public class RemoveUnbalancedParanthesis {
    public static void main(String[] args) {
        System.out.println(removeUnbalanced("((abc)((de))"));
    }

    private static String removeUnbalanced(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            } else if (s.charAt(i) != '(' && s.charAt(i) != ')') {
                word.append(s.charAt(i));
                sb.append(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                sb.append('(');
                sb.append(st.pop());
                sb.append(')');
                st.pop();
            }
        }
        return sb.toString();
    }
}
