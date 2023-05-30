package Charan.KunalDSA;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(LCM(4, 8));
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
