package Charan.Practice.ZohoPrep;

public class NumberOfWorkers {
    public static void main(String[] args) {
        int[][] arr = {
                {900, 910},
                {940, 1200},
                {950, 1120},
                {1100, 1130},
                {1500, 1900},
                {1800, 2000}
        };
        System.out.println(noOfWorkers(arr));
    }

    private static int noOfWorkers(int[][] arr) {
        int workers = 1;
        int len = arr.length;
        int diff, temp;
        for (int i = 0; i < len - 1; i++) {
            diff = arr[i][0] - arr[i + 1][0];
            temp = arr[i][0] + diff;
            for (int j = i + 1; j < len; j++) {
                if (temp > arr[j][1]) {
                    workers++;
                    break;
                }
            }
        }
        return workers;
    }
}