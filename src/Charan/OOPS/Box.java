package Charan.OOPS;

public class Box {
    double height;
    double weight;

    public Box() {
        this.weight = -1;
        this.height = -1;
    }

    public Box(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public void display() {
        System.out.format("Weight: %f, Height: %f", weight, height);
    }
}
