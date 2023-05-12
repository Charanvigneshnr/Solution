package Charan.Recursion;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        System.out.print("Enter the kth number to find the kth fibonacci number: ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(recFunc(k));
    }

    private static int recFunc(int i) {
        if(i<2) return i;
        return recFunc(i-1)+recFunc(i-2);
    }
}

//ip: 1 2 3 4 5
//op: 0 1 1 2 3