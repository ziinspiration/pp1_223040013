package Sesi9_queue;

public class Latihan5Main {
    public static void main(String[] args) {
        Latihan5 queue = new Latihan5();

        // Sebelum enqueue 3x
        System.out.println("### Sebelum enqueue 4x ###");
        System.out.println("size: " + queue.ukuran());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();
        System.out.println();

        // Enqueue 3x
        System.out.println("### Enqueue 4x ###");
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(1);
        System.out.println("size: " + queue.ukuran());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();
        System.out.println("Front: " + queue.front());
    }
}
