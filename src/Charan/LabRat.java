package Charan;

public class LabRat {
    public int[][] noOfFactors(int x)
    {
        int len = (int) Math.sqrt(x);
        int[][] result = new int[len*2][len*2];
        int i;
        for (i = 1; i <= len*2; i++)
        {
            if (x % i == 0 && i<=len)
            {
                result[i][i]=result[i][x/i];
            }
            if (x % i == 0 && i>=len)
            {
                result[i][i]=result[x/i][i];
            }
        }
        return result;
    }
}
