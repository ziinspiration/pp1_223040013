package TugasBesar; //

import java.util.Scanner; // Import kelas Scanner untuk membaca input pengguna

public class App { // Deklarasi kelas publik bernama App
    public static void main(String[] args) { // Metode utama untuk menjalankan program
        Akademik daftarAkademik = new Akademik(); // Membuat objek Akademik untuk menyimpan daftar mahasiswa
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna
        int pilihan; // Deklarasi variabel pilihan untuk menyimpan pilihan menu pengguna

        do { // Mulai loop do-while untuk menampilkan menu berulang kali
            System.out.println("\nMenu:"); // Menampilkan menu
            System.out.println("1. Tambah Mahasiswa"); // Opsi untuk menambah mahasiswa
            System.out.println("2. Hapus Mahasiswa"); // Opsi untuk menghapus mahasiswa
            System.out.println("3. Cari Mahasiswa"); // Opsi untuk mencari mahasiswa
            System.out.println("4. Tampilkan Daftar Mahasiswa"); // Opsi untuk menampilkan daftar mahasiswa
            System.out.println("5. Keluar"); // Opsi untuk keluar dari program
            System.out.print("Pilih opsi: "); // Meminta pengguna memilih opsi
            pilihan = scanner.nextInt(); // Membaca pilihan pengguna
            scanner.nextLine(); // Membaca newline character yang tersisa

            switch (pilihan) { // Memeriksa pilihan pengguna
                case 1: // Jika pilihan adalah 1
                    System.out.print("Masukkan nama mahasiswa: "); // Meminta nama mahasiswa
                    String nama = scanner.nextLine(); // Membaca nama mahasiswa
                    System.out.print("Masukkan NIM mahasiswa: "); // Meminta NIM mahasiswa
                    String nim = scanner.nextLine(); // Membaca NIM mahasiswa
                    Mahasiswa mahasiswa = new Mahasiswa(nama, nim); // Membuat objek Mahasiswa baru
                    daftarAkademik.AddMahasiswa(mahasiswa); // Menambahkan mahasiswa ke daftarAkademik
                    break; // Keluar dari case 1
                case 2: // Jika pilihan adalah 2
                    System.out.print("Masukkan NIM mahasiswa yang akan dihapus: "); // Meminta NIM mahasiswa yang akan dihapus
                    nim = scanner.nextLine(); // Membaca NIM mahasiswa
                    daftarAkademik.DelMahasiswa(nim); // Menghapus mahasiswa dari daftarAkademik
                    break; // Keluar dari case 2
                case 3: // Jika pilihan adalah 3
                    System.out.print("Masukkan NIM mahasiswa yang dicari: "); // Meminta NIM mahasiswa yang dicari
                    nim = scanner.nextLine(); // Membaca NIM mahasiswa
                    daftarAkademik.SearchMahasiswa(nim); // Mencari mahasiswa dalam daftarAkademik
                    break; // Keluar dari case 3
                case 4: // Jika pilihan adalah 4
                    daftarAkademik.tampilkanDaftarMahasiswa(); // Menampilkan daftar mahasiswa
                    break; // Keluar dari case 4
                case 5: // Jika pilihan adalah 5
                    System.out.println("Keluar dari program."); // Menampilkan pesan keluar dari program
                    break; // Keluar dari case 5
                default: // Jika pilihan tidak valid
                    System.out.println("Opsi tidak valid, coba lagi."); // Menampilkan pesan kesalahan
            }
        } while (pilihan != 5); // Ulangi loop jika pilihan bukan 5

        scanner.close(); // Menutup scanner untuk melepaskan sumber daya
    }
}
