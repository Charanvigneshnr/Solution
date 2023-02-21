package Charan.LeetCode;
import java.util.*;
public class GroupAnagrams
{
        public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> outerList = new ArrayList<List<String>>();
            List<String> innerList = new ArrayList<String>();
            int i=0;
            int j=1;
            int len = strs.length;
            for(i=0;i<len-1;i++)
            {
                for (j=i+1;j<len;j++)
                {
                    if ((checkAnagram(strs[i],strs[j])==false)&&j==len-1)
                    {
                        innerList.add(strs[i]);
                        outerList.add(innerList);
                        break;
                    }
                    else
                    {
                        innerList.add(strs[j]);
                    }
                    outerList.add(innerList);
                }
            }
            return outerList;
        }

        static Boolean checkAnagram(String s, String t)
        {
            int len1=s.length();
            int len2=t.length();
            char[] arr1 = s.toCharArray();
            char[] arr2 = t.toCharArray();
            Boolean flag = false;
            if (len1==len2)
            {
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                flag = Arrays.equals(arr1, arr2);
            }
            return flag;
        }
}
