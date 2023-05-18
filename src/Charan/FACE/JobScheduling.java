package Charan.FACE;

import java.util.ArrayList;

public class JobScheduling {

    char id;
    int deadline, profit;

    public JobScheduling() {
    }

    public JobScheduling(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    public static void main(String[] args) {
        ArrayList<JobScheduling> arr = new ArrayList<>();
        arr.add(new JobScheduling('a', 2, 100));
        arr.add(new JobScheduling('b', 1, 20));
        arr.add(new JobScheduling('c', 2, 40));
        arr.add(new JobScheduling('d', 1, 80));
        arr.add(new JobScheduling('e', 3, 60));

        System.out.println("Following is maximum profit sequence of jobs");
        JobScheduling jobScheduling = new JobScheduling();

        jobScheduling.printJobScheduling(arr, 3);
    }

    void printJobScheduling(ArrayList<JobScheduling> arr, int t) {

        int n = arr.size();

        arr.sort((a, b) -> b.profit - a.profit);

        boolean[] result = new boolean[t];

        char[] job = new char[t];

        for (int i = 0; i < n; i++) {

            for (int j = Math.min(t - 1, arr.get(i).deadline - 1); j >= 0; j--) {

                if (!result[j]) {
                    result[j] = true;
                    job[j] = arr.get(i).id;
                    break;
                }
            }
        }

        for (char jb : job)
            System.out.print(jb + " ");
        System.out.println();
    }
}