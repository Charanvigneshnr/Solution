package Charan;

import Charan.Foobar.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Foobar2 f = new Foobar2();
        String[] ques = {"1.1.2", "1.0", "1.3.3", "1.0.12", "1.0.2"};
        String[] res = f.solution(ques);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + ", ");
        }
    }
}

//1.0, 1.0.2, 1.0.12, 1.1.2, 1.3.3