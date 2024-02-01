package Charan.Practice.KunalDSA;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(LCM(7, 12));
        System.out.println(GCD(8, 12));
    }

    static int GCD(int a, int b) {
        if (b == 0)
            return a;
        return GCD(b, a % b);
    }

    static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }
}
