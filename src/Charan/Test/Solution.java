package Charan.Test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Fill code here 
        System.out.println("Generate your password");
        String password = sc.next();
        if (password.length() > 12 || password.length() < 6) {
            System.out.println(password + " is an invalid password");
            return;
        }
        Pattern small = Pattern.compile("[a-z]");
        Pattern caps = Pattern.compile("[A-Z]");
        Pattern splChars = Pattern.compile("[@\\$#*]");
        Pattern numbers = Pattern.compile("[0-9]");
        Matcher m;
        m = small.matcher(password);
        if (!m.find()) {
            System.out.println(password + " is an invalid password");
            return;
        }
// 		int lowerCount=m.group().length();
        int lc = 1;
        while (m.find()) lc++;
        m = caps.matcher(password);
        if (!m.find()) {
            System.out.println(password + " is an invalid password");
            return;
        }
// 		int capsCount=m.group().length();
        int cc = 1;
        while (m.find()) cc++;

        m = splChars.matcher(password);
        if (!m.find()) {
            System.out.println(password + " is an invalid password");
            return;
        }

// 		int splCharsCount=m.group().length();
        int splc = 1;
        while (m.find()) splc++;

        m = numbers.matcher(password);
        if (m.find()) {
            //   int digitCount=m.group().length();
            int count = 1;
            while (m.find()) count++;

            System.out.println("The generated password " + password + " is valid and has " + lc + " lowercase alphabet " + cc + " uppercase alphabet " + splc + " special character " + count + " digit");
        } else {
            System.out.println("The generated password " + password + " is valid and has " + lc + " lowercase alphabet " + cc + " uppercase alphabet " + splc + " special character");
        }
    }
}