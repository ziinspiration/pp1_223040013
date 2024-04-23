package Sesi9_stack;

public class Tugas {
    public static void main(String[] args) {
        Latihan3 stack = new Latihan3(3);

        // Push 3X
        stack.push(2);
        stack.push(4);
        stack.push(1);

        // Pop 2X
        System.out.println("Melakukan Pop 2X");
        stack.pop();
        stack.pop();

        // Setelah Pop
        System.out.println("Size: " + (stack.getTOP() + 1));
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.getTOP());
        System.out.print("Elemen From Top: ");
        int[] array = stack.getArray();
        for (int i = stack.getTOP(); i >= 0; i--) {
            System.out.println(array[i] + " ");
        }
        System.out.println("\n");
    }
}
