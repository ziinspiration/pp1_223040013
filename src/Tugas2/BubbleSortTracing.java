package Tugas2;

public class BubbleSortTracing {
    public static void main(String[] args) {
        int[] data = {4, 7, 6, 2, 8, 3};

        System.out.println("Sebelum diurutkan:");
        printArray(data);

        bubbleSortTracing(data);

        System.out.println("\nSetelah diurutkan:");
        printArray(data);
    }

    public static void bubbleSortTracing(int[] data) {
        int temp;
        int i, j;

        for (i = 0; i < data.length - 1; i++) {
            System.out.println("Langkah ke-" + (i + 1) + ":");

            for (j = 0; j < (data.length - 1) - i; j++) {
                System.out.println("  Pernyataan-1");

                if (data[j] > data[j + 1]) {
                    System.out.println("  Pernyataan-2");

                    System.out.println("  false");

                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;

                    System.out.println("  i=" + i + " j=" + j + " data[j]=" + data[j] + " data[j+1]=" + data[j + 1]);
                    printArray(data);
                } else {
                    System.out.println("  true");
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}