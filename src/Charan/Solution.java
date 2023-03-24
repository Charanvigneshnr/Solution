package Charan;

import Charan.LeetCode.Compress;
import Charan.LeetCode.CountPrimes;

public class Solution {
    public static void main(String[] args) {
        Compress c = new Compress();
        char[] input = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(c.Compress(input));
    }
}