package Sesi5;

import java.util.LinkedList;

public class Latihan2 {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();

        myList.add(2);
        myList.add(6);
        myList.add(3);
        myList.add(5);
        myList.add(1);

        System.out.println("Elemen list setelah ditambah :");
        for (int element : myList) {
            System.out.print(element + " ");
        }
        System.out.println();

        myList.remove(Integer.valueOf(3));

        System.out.println("Elemen list setelah menghapus elemen 3 :");
        for (int element : myList) {
            System.out.print(element + " ");
        }
        System.out.println();

        myList.removeFirstOccurrence(6);
        myList.removeLastOccurrence(5);

        System.out.println("Test :");
        for (int element : myList) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}



