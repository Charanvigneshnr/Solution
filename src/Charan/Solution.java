package Charan;
import Charan.LeetCode.FindPeakElement;

import java.util.*;
public class Solution
{
    public static void main(String[] args)
    {
        LabRat l = new LabRat();
        int[] arr = {1,2,3,4,5,6,7,8,10};
//                   0,1,2,3,4,5,6,7,8,9
        int key = 9;
        System.out.println(l.BinarySearch(arr,key,arr[0],arr[arr.length-1]));
    }
}