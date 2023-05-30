package Charan.KunalDSA;

public class Recursion {
    static int number = 0;

    public static void main(String[] args) {
        recursion(12045);
        System.out.println(number);
    }

    public static void recursion(int n) {
        if (n == 0) {
            return;
        }
        number = number * 10 + n % 10;
        recursion(n / 10);
    }
}
