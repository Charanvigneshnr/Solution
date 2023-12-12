package Charan.CodeForces;

import java.util.Scanner;

public class A282 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            switch (s) {
                case "X++":
                    x++;
                    break;
                case "X--":
                    x--;
                    break;
                case "++X":
                    ++x;
                    break;
                case "--X":
                    --x;
                    break;
            }
        }
        System.out.println(x);
    }
}
