//11. Count Number of Ones
package Charan.Blind75;

public class CountOnes {
    public static void main(String[] args) {
//        System.out.println(hammingWeight(11111111111111111111111111111101));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            int last_bit = n & 1;
            count += last_bit;
            n = n >>> 1;
        }
        return count;
    }
}
/*
Idea:
1. And the number with 1
2. Unsigned right shift by 1 >>>1 till n!=0
 */