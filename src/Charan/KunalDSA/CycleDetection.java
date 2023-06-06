package Charan.KunalDSA;

public class CycleDetection {
    public static void main(String[] args) {

    }

    public boolean isHappy(int num) {
        int slow = num;
        int fast = num;
        do {
            slow = powernumber(slow);
            fast = powernumber(powernumber(fast));
        } while (slow != fast);
        return slow == 1;
    }

    public int powernumber(int num) {
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans += rem * rem;
            num /= 10;
        }
        return ans;
    }
}
