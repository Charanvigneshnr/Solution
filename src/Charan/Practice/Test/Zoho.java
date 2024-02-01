package Charan.Practice.Test;

public class Zoho {
    public static void main(String[] args) {
        numToStr(111);
    }

    public static void numToStr(int num) {
        if (num == 0) {
            System.out.println("Zero");
            return;
        }
        int len = (int) Math.log10(num) + 1;
        String[] eleven = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        switch (len) {
            case 1: {
                System.out.println(ones[num]);
                break;
            }
            case 2: {
                if (num == 10) {
                    System.out.println("Ten");
                } else if (num > 10 && num < 20) {
                    System.out.println(eleven[num % 10]);
                } else if (num > 19) {
                    String res = tens[(num / 10) - 2] + " " + ones[num % 10];
                    System.out.println(res);
                }
                break;
            }
            case 3: {
                if (num % 100 == 0) {
                    String res = ones[num / 100] + " Hundred";
                    System.out.println(res);
                } else if (num % 10 == 0) {
                    String res = ones[num / 100] + " Hundred and " + tens[(num % 100) / 10 - 2];
                    System.out.println(res);
                } else if (num % 100 >= 11 && num % 100 <= 19) {
                    String res = ones[num / 100] + " Hundred and " + eleven[num % 10 - 1];
                    System.out.println(res);
                } else {
                    String res = ones[num / 100] + " Hundred and " + tens[(num % 100) / 10 - 2] + " " + ones[num % 10];
                    System.out.println(res);
                }
                break;
            }
            default: {
                System.out.println("Enter a number between 0 and 999");
                break;
            }
        }
    }
}