package Charan.OOPS;

public class OOPS_1 {
    private int rn;
    private int marks;
    private String name;

    public OOPS_1(String name, int rn, int marks) {
        System.out.println("Inside OOPS_1 Constructor");
        this.name = name;
        this.rn = rn;
        this.marks = marks;
    }

    public int getRn() {
        return rn;
    }

    public void setRn(int rn) {
        this.rn = rn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void display() {
        System.out.format("Name: %s\nRoll Number: %d\nMarks: %d\n\n", name, rn, marks);
        return;
    }
}
