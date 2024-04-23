package Tugas3;

public class StrukturListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAtEnd(3);
        list.addAtEnd(4);
        list.addAtMiddle(2,7);
        list.addAtMiddle(2,8);
        list.addAtBeginning(5);

        list.display();
    }
}
