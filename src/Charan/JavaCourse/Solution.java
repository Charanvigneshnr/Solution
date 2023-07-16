package Charan.JavaCourse;

public class Solution {
    public static void main(String[] args) {
        for (Color clr : Color.values()) {
            System.out.print(clr.name());
            System.out.print(clr.getString());
            System.out.println();
        }
    }
}
