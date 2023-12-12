package Charan.CodeForces;

import java.util.Scanner;

public class A263 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[5][5];
        int posX;
        int posY;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] == 1) {
                    posX = Math.abs(2 - i);
                    posY = Math.abs(2 - j);
                    System.out.println(posX + posY);
                    break;
                }
            }
        }
    }
}
