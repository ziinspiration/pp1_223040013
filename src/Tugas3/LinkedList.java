package Tugas3;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addAtBeginning(double data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addAtMiddle(int position, double data) {
        if (position <= 0) {
            addAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == position - 1) {
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
            count++;
        }
        System.out.println("Position is out of range");
    }

    public void addAtEnd(double data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
