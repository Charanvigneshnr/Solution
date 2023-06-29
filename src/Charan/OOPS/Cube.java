package Charan.OOPS;

public class Cube extends Box {
    double side;

    public Cube() {
        super();
        this.side = -1;
    }

    public Cube(double height, double width, double side) {
        super(height, width);
        // super.display();
        this.side = side;
        // System.out.println(this.side);
    }


    public void display() {
        System.out.format("Height: %f, Width: %f Side: %f", height, weight, side);
    }
}
