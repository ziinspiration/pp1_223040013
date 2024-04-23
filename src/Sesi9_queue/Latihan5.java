package Sesi9_queue;

public class Latihan5 {
    private Node FRONT;
    private Node REAR;

    public Latihan5() {
        FRONT = null;
        REAR = null;
    }

    public boolean isEmpty() {
        return FRONT == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }

    public void displayElements() {
        if (isEmpty()) {
            System.out.println("Elemen Queue: Queue kosong");
            return;
        }
        Node current = FRONT;
        System.out.print("Elemen Queue: ");
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public int ukuran() {
        int ukuran = 0;
        Node current = FRONT;
        while (current != null) {
            ukuran++;
            current = current.getNext();
        }
        return ukuran;
    }

    public int front() {
        return isEmpty() ? -1 : FRONT.getData();
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
