package Charan;

import java.util.*;

public class TestHere
{
    static int countSpecials(int[] a, int n, int k){
        int f = (int)Math.floor(n/k);
        int answer = 0;
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        int i = 0;
        int freq;
        for (i = 0; i < n; i++)
        {
            freq = countFreq(a, a[i], n);
            hmap.put(a[i], freq);
        }
        Set<Map.Entry<Integer, Integer>> s = hmap.entrySet();
        for (Map.Entry<Integer, Integer> it: s)
        {
            if (it.getValue() == f)
            {
                answer++;
            }
        }
        return answer;
    }

    static int countFreq(int a[], int target, int n){
        int i;
        int ans = 0;
        for (i = 0; i < n; i++)
        {
            if (a[i]==target)
            {
                ans++;
            }
        }
        return ans;
    }
}
