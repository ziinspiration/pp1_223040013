package Sesi7;
public class LinkedList {
    private Node HEAD;

    public LinkedList() {
        this.HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }
    public void addMid(Matakuliah data, int position) {
        if (position < 0) {
            System.out.println("Posisi harus non-negatif");
            return;
        }

        if (position == 0) {
            addHead(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = HEAD;
        Node previous = null;

        int currentPosition = 0;
        while (current != null && currentPosition < position) {
            previous = current;
            current = current.getNext();
            currentPosition++;
        }


        if (currentPosition != position) {
            System.out.println("Posisi melebihi ukuran linked list");
            return;
        }
        
        previous.setNext(newNode);
        newNode.setNext(current);
    }

    public void addTail(Matakuliah data) {
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

    public void displayElement() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            Node curNode = HEAD;
            while (curNode != null) {
                Matakuliah currentMatakuliah = curNode.getData();
                System.out.println("Matakuliah: " + currentMatakuliah.getKode() +
                        ", " + currentMatakuliah.getNama() +
                        ", " + currentMatakuliah.getSks());
                curNode = curNode.getNext();
            }
            System.out.println();
        }
    }
}
