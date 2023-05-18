package Charan.Test;

import java.util.Scanner;
import java.util.Stack;


public class LabRat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            stack.push(sc.nextInt());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(stack.pop());
        }
    }
}

