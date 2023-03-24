package Charan;

public class LabRat {
    public int BinarySearch(int[] arr, int target) {
        int low = arr[0];
        int high = arr[arr.length - 1];
        int mid = low + (high - low) / 2;
        while (low <= high) {
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
            mid = low + (high - low) / 2;
        }
        return high;
    }
}
