package Sesi4;

public class Main {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node insert(Node head, int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return head;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(9);
        head = insert(head, 8);
        head = insert(head, 7);
        head = insert(head, 6);

        System.out.println("Original list:");
        printList(head);

        Node temp = head;
        int position = 0;
        while (temp != null && position != 0) {
            temp = temp.next;
            position++;
        }


        if (temp != null) {
            Node newNode = new Node(3);
            newNode.next = temp.next;
            temp.next = newNode;
            System.out.println("Node with data 3 inserted after position " + position);
        } else {
            System.out.println("Position node not found.");
        }

        System.out.println("Updated list:");
        printList(head);
    }
}