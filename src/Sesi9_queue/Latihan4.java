package Sesi9_queue;

class Latihan4_queue {
    public static void main(String[] args) {
        Latihan3_queue queue = new Latihan3_queue();

        // Sebelum enqueue 3x
        System.out.println("### Sebelum enqueue 3x ###");
        System.out.println("Size: " + queue.ukuran());
        System.out.println("isEmpty: " + queue.kosong());
        System.out.println();

        // Enqueue 3x
        System.out.println("### Enqueue 3x ###");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Size: " + queue.ukuran());
        System.out.println("isEmpty: " + queue.kosong());
        System.out.println("Front: " + queue.front());
    }
}
