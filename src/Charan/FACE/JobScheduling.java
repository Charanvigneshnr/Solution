package Charan.FACE;

import org.jetbrains.annotations.NotNull;

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
        arr.add(new JobScheduling('b', 2, 27));
        arr.add(new JobScheduling('c', 1, 25));
        arr.add(new JobScheduling('d', 1, 19));
        arr.add(new JobScheduling('e', 3, 15));

        System.out.println("Following is maximum profit sequence of jobs");
        JobScheduling jobScheduling = new JobScheduling();

        jobScheduling.printJobScheduling(arr, 3);
    }

    void printJobScheduling(@NotNull ArrayList<JobScheduling> arr, int t) {

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
