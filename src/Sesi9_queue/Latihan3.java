package Sesi9_queue;

class Latihan3_queue {
    private Node FRONT;
    private Node REAR;

    public Latihan3_queue() {
        FRONT = null;
        REAR = null;
    }

    public boolean kosong() {
        return FRONT == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (kosong()) {
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }

    public int ukuran() {
        int ukuran = 0;
        Node curNode = FRONT;
        while (curNode != null) {
            ukuran++;
            curNode = curNode.getNext();
        }
        return ukuran;
    }

    public int front() {
        return FRONT != null ? FRONT.getData() : -1;
    }

    private static class Node {
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
