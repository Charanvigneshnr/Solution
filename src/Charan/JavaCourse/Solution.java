package Charan.JavaCourse;

public class Solution {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.addElem("Hello");
        list.addElem("World");
        System.out.println(list.getElem(1));
        System.out.println(list);
        MyList<Integer> listnum = new MyList<>();
        listnum.addElem(1);
        listnum.addElem(2);
        System.out.println(listnum.getElem(1));
        System.out.println(listnum);
    }
}
