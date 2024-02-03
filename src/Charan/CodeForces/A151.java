package Charan.CodeForces;

import java.util.Scanner;

public class A151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        int res = Math.min(Math.min((k * l) / nl, c * d), p / np) / n;
        System.out.println(res);
    }
}
