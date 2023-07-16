package Charan.Test;

import java.util.HashMap;

public class LabRat {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");
        map.put(6, "F");
        int len = map.size();
        int i;
        for (i = 1; i <= len; i++) {
            System.out.println(map.get(i));
            System.out.println(map.containsValue((char) ('A' + (i - 1))));
        }
        System.out.println((char) ('A' + 1));
    }
}
