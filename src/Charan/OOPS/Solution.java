package Charan.OOPS;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OOPS_1 ob1 = new OOPS_1("Charan Vignesh", 21, 95);
        OOPS_1 ob2 = new OOPS_1("Dakshina Ragul", 23, 93);
        OOPS_1 ob3 = new OOPS_1("Hariram", 42, 94);
        ob1.display();
        ob2.display();
        ob3.display();
    }
}

