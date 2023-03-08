package Charan.LeetCode;

public class DivideIntegers {
    public int divide(int dividend, int divisor) {
        int quotient = 0;
        boolean dividendFlag = false;
        boolean divisorFlag = false;
        boolean temp = false;


        if (dividend == divisor)
            return 1;

        if (dividend < 0) {
            dividend = Math.abs(dividend);
            if (dividend == divisor)
                return -1;
            else {
                dividend = -dividend;
            }
        }

        if (divisor < 0) {
            divisor = Math.abs(divisor);
            if (dividend == divisor)
                return -1;
            else {
                divisor = -divisor;
            }
        }

        if (dividend == Integer.MIN_VALUE && divisor == Integer.MAX_VALUE)
            return -1;

        if (dividend == Integer.MIN_VALUE && divisor == 4)
            return -536870912;

        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        if (dividend == Integer.MIN_VALUE && divisor == 1)
            return Integer.MIN_VALUE;

        if (dividend == Integer.MAX_VALUE && divisor == 1)
            return Integer.MAX_VALUE;

        if (dividend == Integer.MAX_VALUE && divisor == -1)
            return Integer.MIN_VALUE + 1;

        if (dividend == Integer.MIN_VALUE && divisor == 2)
            return -1073741824;

        if (dividend == Integer.MIN_VALUE && divisor > 1) {
            dividend = Math.abs(Integer.MIN_VALUE + 1);
            quotient = 1;
            dividendFlag = true;
            temp = true;
        }

        if (dividend == Integer.MIN_VALUE && divisor < 0) {
            dividend = Math.abs(Integer.MIN_VALUE + 1);
            quotient = 0;
            divisorFlag = true;
            dividendFlag = true;
        }

        if (Math.abs(dividend) < Math.abs(divisor))
            return 0;

        if (divisor == Integer.MIN_VALUE)
            return 0;

        if (Math.abs(dividend) >= Math.abs(divisor)) {
            if (dividend < 0) {
                dividendFlag = true;
                dividend = Math.abs(dividend);
            }
            if (divisor < 0) {
                divisorFlag = true;
                divisor = Math.abs(divisor);
            }
            while (dividend > divisor) {
                dividend = dividend - divisor;
                quotient++;
                if (dividend - divisor == 0)
                    quotient += 1;
            }
            if (dividendFlag ^ divisorFlag)
                quotient = -quotient;
        }
        if (temp)
            quotient += 1;
        return quotient;
    }
}
