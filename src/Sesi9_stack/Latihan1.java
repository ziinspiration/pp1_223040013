package Sesi9_stack;

public class Latihan1 {
    private int[] array;
    private int capacity;
    private int TOP;

    public Latihan1(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        TOP = -1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Penuh");
        } else {
            TOP++;
            array[TOP] = data;
        }
    }

    public boolean isFull() {
        return (TOP == capacity - 1);
    }
}
