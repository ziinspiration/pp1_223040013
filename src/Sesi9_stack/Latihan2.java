package Sesi9_stack;

public class Latihan2 {
    private int[] array;
    private int capacity;
    private int TOP;

    public final int MIN = -1;

    public Latihan2(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
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

    public boolean isFull() {
        return (TOP == capacity - 1);
    }
}
