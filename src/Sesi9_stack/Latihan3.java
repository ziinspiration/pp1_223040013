package Sesi9_stack;

public class Latihan3 {
    private int[] array;
    private int capacity;
    private int TOP;
    public final int MIN = -1;

    public Latihan3(int capacity) {
        array = new int[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Penuh");
        } else {
            TOP++;
            array[TOP] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Kosong");
            return -1;
        } else {
            int poppedElement = array[TOP];
            TOP--;
            return poppedElement;
        }
    }

    public boolean isEmpty() {
        return (TOP == MIN);
    }

    public boolean isFull() {
        return (TOP == capacity - 1);
    }

    public int getTOP() {
        return TOP;
    }

    public int[] getArray() {
        return array;
    }
}
