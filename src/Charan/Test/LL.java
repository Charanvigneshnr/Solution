package Charan.Test;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
        System.out.println("LL is created");
    }

    public void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Size of linked list: " + size);
    }

    public void insertLast(int data) {
        if (tail == null) {
            insertFirst(data);
        } else {
            Node node = new Node(data);
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void insertAt(int data, int index) {
        if (index == 0 || index < size) {
            insertFirst(data);
            return;
        }
        if (index == size) {
            insertLast(data);
            return;
        }
        if (index > size) {
            insertLast(data);
        }

        Node temp = head;
        for (int i = 1; i < index - 1; i++) {
            temp = temp.next;
        }
        Node node = new Node(data, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return 0;
        }
        head = head.next;
        size--;
        return 0;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.data;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void find(int target) {
        Node temp = head;
        int pos = 1;
        while (temp != null) {
            if (temp.data == target) {
                System.out.println(pos);
                break;
            }
            temp = temp.next;
            pos++;
        }
    }

    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
        }
        if (index == size - 1) {
            deleteLast();
            return;
        }
        Node prev = get(index - 1);
        int val = prev.next.data;
        prev.next = prev.next.next;
        size--;
    }

    private class Node {
        private final int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
