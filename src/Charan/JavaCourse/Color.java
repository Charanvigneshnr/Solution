package Charan.JavaCourse;

enum Color {
    RED("Red"), GREEN("Green"), BLUE("Blue");
    private final String s;

    Color(String s) {
        this.s = s;
    }

    public String getString() {
        return s;
    }
}
