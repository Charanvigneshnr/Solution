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
            case 'A':A.LetterA(s, StrLen);break;
            case 'B':B.LetterB(s, StrLen);break;
            case 'C':C.LetterC(s, StrLen);break;
            case 'D':D.LetterD(s, StrLen);break;
            case 'E':E.LetterE(s, StrLen);break;
            case 'F':F.LetterF(s, StrLen);break;
            case 'G':G.LetterG(s, StrLen);break;
            case 'H':H.LetterH(s, StrLen);break;
            case 'I':I.LetterI(s, StrLen);break;
            case 'J':J.LetterJ(s, StrLen);break;
            case 'K':K.LetterK(s, StrLen);break;
            case 'L':L.LetterL(s, StrLen);break;
            case 'M':M.LetterM(s, StrLen);break;
            case 'N':N.LetterN(s, StrLen);break;
            case 'O':O.LetterO(s, StrLen);break;
            case 'P':P.LetterP(s, StrLen);break;
            case 'Q':Q.LetterQ(s, StrLen);break;
            case 'R':R.LetterR(s, StrLen);break;
            case 'S':S.LetterS(s, StrLen);break;
            case 'T':T.LetterT(s, StrLen);break;
            case 'U':U.LetterU(s, StrLen);break;
            case 'V':V.LetterV(s, StrLen);break;
            case 'W':W.LetterW(s, StrLen);break;
            case 'X':X.LetterX(s, StrLen);break;
            case 'Y':Y.LetterY(s, StrLen);break;
            case 'Z':Z.LetterZ(s, StrLen);break;
        }
    }
}
