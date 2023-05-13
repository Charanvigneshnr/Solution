package Charan;

import Charan.Foobar.*;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the first number:");
//        int a = sc.nextInt();
////        System.out.print("Enter the second number:");
////        int b = sc.nextInt();
////        if ((a^b)==0)
////        {
////            System.out.println("Equal");
////        }
////        else
////        {
////            System.out.println("Nah!");
////        }
//        if ((a & 1)==1)
//            System.out.println("Odd");
//        else
//            System.out.println("Even");
        int a = 5;
        int b = a++ + ++a + a++ + ++a;
        System.out.println(b);
    }
}

//Program to find whether the given numbers are equal or nah, without using comparison operators and arithmetic operators.
