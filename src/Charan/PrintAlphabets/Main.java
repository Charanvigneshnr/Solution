package Charan.PrintAlphabets;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string of odd length: ");
        String s = sc.nextLine();
        int StrLen=s.length();
        System.out.print("Enter the alphabet to print: ");
        char Alphabet=sc.next().charAt(0);
        switch (Alphabet)
        {
            case 'X':
            {
                X.LetterX(s, StrLen);
                break;
            }
            case 'C':
            {
                C.LetterC(s, StrLen);
                break;
            }
            case 'L':
            {
                L.LetterL(s, StrLen);
                break;
            }
            case 'O':
            {
                O.LetterO(s, StrLen);
                break;
            }
        }
    }
}
