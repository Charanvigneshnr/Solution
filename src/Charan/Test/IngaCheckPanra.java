package Charan.Test;

public class IngaCheckPanra {
    public static void main(String[] args) {
        System.out.println(isArmstrong(1635));
        System.out.println(fact(10));
    }

    public static boolean isArmstrong(int n) {
        int temp = n;
        int num = 0;
        int len = (int) Math.log10(n) + 1;
        while (n > 0) {
            num += Math.pow((n % 10), len);
            n /= 10;
        }
        return num == temp;
    }

    public static int fact(int m) {
        if (m == 0)
            return 1;
        return m * fact(m - 1);
    }
}
