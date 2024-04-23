package Sesi9_stack;

public class Latihan4 {
    public static void main(String[] args) {
        Latihan3 stack = new Latihan3(3);

        // Sebelum Push
        System.out.println("Sebelum Push");
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.getTOP());
        System.out.println("Elemen from TOP: ");
        for (int i = stack.getTOP(); i >= 0; i--) {
            System.out.println(stack.getArray()[i] + " ");
        }
        System.out.println("\n");

        // Push 3X
        System.out.println("Melakukan Push 3X");
        stack.push(2);
        stack.push(4);
        stack.push(1);

        // Setelah Push
        System.out.println("Setelah Push");
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.getTOP());
        for (int i = stack.getTOP(); i >= 0; i--) {
            System.out.println(stack.getArray()[i] + " ");
        }
    }
}
