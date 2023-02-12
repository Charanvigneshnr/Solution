package Charan;

public class Solution
{
    public static void main(String[] args)
    {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(1);
        list.insertLast(4);
        list.insertAt(6,6);
        list.insertAt(7,5);
        list.insertAt(8,10);
        list.display();
        list.delete(1);
        list.display();
    }
}