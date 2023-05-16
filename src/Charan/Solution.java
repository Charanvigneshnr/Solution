package Charan;

import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes: ");
        int n = sc.nextInt();
        System.out.println("Enter number of edges: ");
        int m = sc.nextInt();
        int i, j;
        int[][] ip = new int[n][m];
        for (i = 0; i < m; i++) {
            System.out.print("Node A: ");
          ip[i][0]=sc.nextInt();
            System.out.print("Node B: ");
          ip[i][1]=sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            System.out.print(i+"->");
            for (j = 0; j < m; j++) {
                if (ip[j][0] == i) {
                    System.out.print(ip[j][1]+", ");
                }
                else if (ip[j][1] == i) {
                    System.out.print(ip[j][0]+", ");
                }
            }
            System.out.println();
        }
    }
}

//        System.out.print("Enter number of nodes: ");
//        int n = sc.nextInt();
//        System.out.print("Enter number of edges: ");
//        int m = sc.nextInt();
//        System.out.print("Is directed?:");
//        int c = sc.nextInt();
//        int[][] arr = new int[n + 1][m + 1];
//        int i;
//        int nodeA = 0;
//        int nodeB = 0;
//        int weight = 0;
//        switch (c) {
//            case 0:
////                    undirected graph
//                for (i = 0; i < m; i++) {
//                    System.out.print("Enter from node: ");
//                    nodeA = sc.nextInt();
//                    System.out.print("Enter to node: ");
//                    nodeB = sc.nextInt();
//                    System.out.print("Enter weight: ");
//                    weight = sc.nextInt();
//                    arr[nodeA][nodeB] = weight;
//                    arr[nodeB][nodeA] = weight;
//                }
//                break;
//            case 1:
////                    directed graph
//                for (i = 0; i < m; i++) {
//                    System.out.print("Enter from node: ");
//                    nodeA = sc.nextInt();
//                    System.out.print("Enter to node: ");
//                    nodeB = sc.nextInt();
//                    System.out.print("Enter weight: ");
//                    weight = sc.nextInt();
//                    arr[nodeA][nodeB] = weight;
//                }
//                break;
//            default:
//                System.out.println("Invalid choice");
//                break;
//        }
//        for (i = 1; i <= n; i++) {
//            for (int j = 1; j <= m; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }