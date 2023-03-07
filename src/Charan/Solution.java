package Charan;
import Charan.LeetCode.*;

public class Solution
{
    public static void main(String[] args)
    {
        CeilingOfANumber c = new CeilingOfANumber();
        FloorOfANumber f = new FloorOfANumber();
        int[] arr = {2,4,6,8,10};
//                   0 1 2 3 4
        int key = 5;
        System.out.println(f.FloorOfANumber(arr,key,0,arr.length-1));
        System.out.println(c.CeilingOfANumber(arr,key,0,arr.length-1));
    }
}