package TugasBesar;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Akademik daftarAkademik = new Akademik();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Cari Mahasiswa");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String nim = scanner.nextLine();
                    Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
                    daftarAkademik.AddMahasiswa(mahasiswa);
                    break;
                case 2:
                    System.out.print("Masukkan NIM mahasiswa yang akan dihapus: ");
                    nim = scanner.nextLine();
                    daftarAkademik.DelMahasiswa(nim);
                    break;
                case 3:
                    System.out.print("Masukkan NIM mahasiswa yang dicari: ");
                    nim = scanner.nextLine();
                    daftarAkademik.SearchMahasiswa(nim);
                    break;
                case 4:
                    daftarAkademik.tampilkanDaftarMahasiswa();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Opsi tidak valid, coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}