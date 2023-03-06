package Charan;

public class LabRat
{
    static int BinarySearch(int[] arr, int key, int low, int high)
    {

        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == key)
            return mid;
        else if (arr[mid] > key)
            return BinarySearch(arr, key, low, mid - 1);
        else
            return BinarySearch(arr, key, mid + 1, high);
    }
}
