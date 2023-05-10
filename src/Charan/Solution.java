package Charan;

import Charan.Foobar.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Foobar2 f = new Foobar2();
        String[] ques = {"1.11", "2.0.0", "1.2", "2", "0.1", "1.2.1", "1.1.1", "2.0"};
        String[] res = f.solution(ques);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + ", ");
        }
    }
}

//0.1,1.1.1,1.2,1.2.1,1.11,2,2.0,2.0.0