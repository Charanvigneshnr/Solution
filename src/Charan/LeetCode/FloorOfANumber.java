package Charan.LeetCode;

public class FloorOfANumber
{
    static int FloorOfANumber(int[] arr, int key, int low, int high)
    {
        int mid = low + (high-low) / 2;
        while (low <= high)
        {
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key)
                high = mid - 1;
            else
                low = mid + 1;
            mid = low + (high-low) / 2;
        }
        return high;
    }
}
