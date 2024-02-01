package Charan.Practice.KunalDSA;

public class NewtonSQRT {
    public static void main(String[] args) {
        System.out.format("%.2f", NewtonSQRT(40));
    }

    public static double NewtonSQRT(double n) {
        double root;
        double x = n;
        while (true) {
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < 0.05) {
                break;
            }
            x = root;
        }
        return root;
    }
}
