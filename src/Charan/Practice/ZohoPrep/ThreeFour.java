package Charan.Practice.ZohoPrep;

public class ThreeFour {
    public static void main(String[] args) {
        System.out.println(nthNumber(3));
    }

    public static int nthNumber(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            if (n % 2 == 0) {
                n = (n - 1) / 2;
                sb.append('4');
            } else {
                n /= 2;
                sb.append('3');
            }
        }
        return Integer.valueOf(sb.reverse().toString());
    }
}
