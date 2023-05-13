package Charan;

import Charan.*;
import Charan.Recursion.Recursion;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Recursion r = new Recursion();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int res= r.result(arr, 4);
        System.out.println(res);
    }
}
