package Charan.Recursion;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        System.out.print("Enter the k number to find the kth fibonacci number: ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
//        System.out.format("Fibonacci number: %d\n",recFunc(k));
        System.out.println("Using constant time method: "+fibonacci(k));
    }

    private static int recFunc(int i) {
        if(i<2) return i;
        return recFunc(i-1)+recFunc(i-2);
    }

        public static long fibonacci(int n) {
            double a = (1 + Math.sqrt(5)) / 2;
            double b = (1 - Math.sqrt(5)) / 2;
            return (long) ((Math.pow(a, n) - Math.pow(b, n)) / Math.sqrt(5));
        }
}

//ip: 1 2 3 4 5
//op: 0 1 1 2 3