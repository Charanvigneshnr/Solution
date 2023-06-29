package Charan.OOPS;

class A {
    public static void display() {
        System.out.println("A");
    }
}

class B extends A {
    public static void display() {
        System.out.println("B");
    }
}

public class Soln {
    public static void main(String[] args) {
        A b = new B();
        A.display();
    }
}
