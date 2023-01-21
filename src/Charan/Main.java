package Charan;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string of odd length: ");
        String s = sc.nextLine();
        int StrLen=s.length();
        X.LetterX(s, StrLen);
        L.LetterL(s, StrLen);
    }
}
