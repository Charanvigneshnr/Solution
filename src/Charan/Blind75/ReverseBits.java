//13. Reverse Bits
package Charan.Blind75;

public class ReverseBits {
    public static void main(String[] args) {
//        System.out.println(reverseBits(00000010100101000001111010011100));
    }

    public static int reverseBits(int n) {
        int i, bit, res = 0;
        for (i = 0; i < 32; i++) {
            bit = (n >>> i) & 1;
            res = res | (bit << (31 - i));
        }
        return res;
    }
}

/*
Idea:
1. Right shift by i and with 1 for 32 times
2. Or the res with the bit left shifted (31-i) times
 */