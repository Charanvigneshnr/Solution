package Charan.Test;

import java.util.Scanner;

class Student {


    // Fill the code
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;

    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = "NIT";
    }

    public Student(int studentId, String studentName, String studentAddress, String collegeName) {
        this(studentId, studentName, studentAddress);
        this.collegeName = collegeName;
    }

    //getters
    public int getStudentId() {
        return studentId;
    }

    //setters
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void display() {
        String op = String.format("Student id:%d\nStudent name:%s\nAddress:%s\nCollege name:%s", studentId, studentName, studentAddress, collegeName);
        System.out.println(op);
    }


}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student;
        System.out.println("Enter Student's Id:");
        int studentId = sc.nextInt();
        System.out.println("Enter Student's Name:");
        String studentName = sc.next();
        System.out.println("Enter Student's address:");
        String studentAddress = sc.next();
        System.out.println("Whether the student is from NIT(Yes/No):");
        String nitInput = sc.next();
        while (true) {
            if (nitInput.equalsIgnoreCase("yes") || nitInput.equalsIgnoreCase("no"))
                break;
            System.out.println("Wrong Input");
            System.out.println("Whether the student is from NIT(Yes/No):");
            nitInput = sc.next();
        }

        if (nitInput.equalsIgnoreCase("no")) {
            System.out.println("Enter the college name:");
            String collegeName = sc.next();
            student = new Student(studentId, studentName, studentAddress, collegeName);
        } else {
            student = new Student(studentId, studentName, studentAddress);
        }
        student.display();
        sc.close();
    }
}