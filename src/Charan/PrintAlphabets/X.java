package Charan.PrintAlphabets;

public class X {
    static void LetterX(String s, int len) {
        for (int i = 0; i < len; i++)
        {
            for (int j = 0; j < len; j++)
            {
                if ((i==j)||(i+j==len-1))
                {
                    System.out.print(s.charAt(i));
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
