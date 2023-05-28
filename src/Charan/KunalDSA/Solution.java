package Charan.KunalDSA;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120}, {130, 140, 150, 160}};
        RowColMatrix rc = new RowColMatrix();
        System.out.println(Arrays.toString(rc.searchRow(arr, 120)));
    }
}
