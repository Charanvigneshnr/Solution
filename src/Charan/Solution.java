package Charan;

import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(1);
//        list.insertLast(4);
//        list.insertAt(6,6);
//        list.insertAt(7,5);
//        list.insertAt(8,10);
//        list.display();
//        list.delete(1);
//        list.display();
//        list.delete(8);
//        list.display();
//        list.find(8);
   }
        public List<Integer> getRow(int rowIndex) {
            int[][] pascal = new int[rowIndex+1][];
            for (int i = 0; i < rowIndex+1; i++){
                int[] row = new int[i + 1];
                row[0] = 1;
                row[i] = 1;
                for (int j = 1; j < i; j++){
                    row[j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
                pascal[i] = row;
            }
            // for(int i=0;i<=rowIndex+1;i++)
            // {
            //     ar.add(pascal[rowindex][i]);
            // }
            List list=(List)Arrays.asList(pascal);
            List<Integer> result=list.subList(rowIndex,list.size());
            String str=result.toString();
            String s = str.substring(1,str.length()-1);
            int len = rowIndex+rowIndex-1;
            list.clear();
            for (int i=0;i<len;i++)
            {
                if (s.charAt(i)<=0 && s.charAt(i)>=9)
                {
                    list.add(s.charAt(i)-'0');
                }
            }
            return list;
    }
}