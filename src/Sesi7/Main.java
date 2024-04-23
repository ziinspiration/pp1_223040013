package Sesi7;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addHead(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
        list.addMid(new Matakuliah("IF002", "Pemrograman Web", 3), 1);
        list.addMid(new Matakuliah("IF003", "Struktur Diskrit", 3), 1);
        list.addTail(new Matakuliah("IF001", "Dasar Pemrograman", 4));

        list.displayElement();
    }
}



