package Charan.Test;

import Charan.KunalDSA.RBS;

public class IngaCheckPanra {
    public static void main(String[] args) {
        RBS rb = new RBS();
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(arr[rb.findPivot(arr)]);
    }
}
