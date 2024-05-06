package Sesi9_queue;

public class TugasMain {
    public static void main(String[] args) {
        Tugas queue = new Tugas();

        // Sebelum enqueue 3x
        System.out.println("### Sebelum enqueue 3x ###");
        System.out.println("size: " + queue.ukuran());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();
        System.out.println();

        // Enqueue 3x
        System.out.println("### Enqueue 3x ###");
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(1);
        System.out.println("size: " + queue.ukuran());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();
        System.out.println("Front: " + queue.front());
        System.out.println();

        // Dequeue 2x
        System.out.println("### Dequeue 2x ###");
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("size: " + queue.ukuran());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();
        System.out.println("Front: " + queue.front());
    }
}
