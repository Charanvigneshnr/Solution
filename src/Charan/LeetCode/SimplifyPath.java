package Charan.LeetCode;

import org.jetbrains.annotations.NotNull;

import java.util.Stack;

public class SimplifyPath {
    public @NotNull String SimplifyPath(@NotNull String path) {
        Stack<String> myStack = new Stack<>();
        String[] folders = path.split("/");
        for (String s : folders) {
            if (s.equals(".") || s.isEmpty()) {
                continue;
            } else if (s.equals("..")) {
                if (!myStack.isEmpty()) {
                    myStack.pop();
                }
            } else {
                myStack.push(s);
            }
        }
        String res = "/";
        res += String.join("/", myStack);
        return res;
    }
}
