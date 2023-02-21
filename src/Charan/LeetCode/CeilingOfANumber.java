package Charan.LeetCode;

public class CeilingOfANumber
{
    public int find(int[] arr, int n)
    {
        int len = arr.length;
        return binarySearch(arr, n, 0, len - 1);
    }
    static int binarySearch(int[] arr, int n, int low, int high)
    {
        if(low > high)
            return -1;
        int mid = (low + high) / 2;
        if(arr[mid] == n)
            return mid;
        else if(arr[mid] > n)
            return binarySearch(arr, n, low, mid - 1);
        else if(arr[mid] < n)
            return binarySearch(arr, n, mid + 1, high);
        else return mid+1;
    }
}