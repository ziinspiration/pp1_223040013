package Tugas3;

public class StrukturList {
    private Node HEAD;

    public class Node {
        private double data;
        private Node next;

        public Node(double data) {
            this.data = data;
            this.next = null;
        }

        public double getData() {
            return data;
        }

        public void setData(double data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addHead(double data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void addMiddle(double data, int index) {
        Node newNode = new Node(data);
        Node current = HEAD;
        Node previous = null;
        int count = 0;

        if (isEmpty() || index == 0) {
            addHead(data);
            return;
        }

        while (current != null && count < index) {
            previous = current;
            current = current.getNext();
            count++;
        }

        if (current == null && count == index) {
            addTail(data);
        } else if (current != null) {
            previous.setNext(newNode);
            newNode.setNext(current);
        }
    }

    public void addTail(double data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node current = HEAD;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("List kosong");
        } else {
            Node current = HEAD;
            while (current != null) {
                System.out.print(current.getData() + " ");
                current = current.getNext();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StrukturList StrukturList = new StrukturList();

        StrukturList.addHead(5.5); // Menambahkan elemen 5.5 di awal
        StrukturList.addTail(3.3); // Menambahkan elemen 3.3 di akhir
        StrukturList.addMiddle(8.8, 1); // Menambahkan elemen 8.8 di tengah (indeks 1)

        System.out.println("Isi Linked List:");
        StrukturList.printList();
    }
}