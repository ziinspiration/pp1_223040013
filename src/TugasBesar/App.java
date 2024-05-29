package TugasBesar; // Mendeklarasikan bahwa kelas App berada dalam package bernama TugasBesar

import java.util.Scanner; // Mengimpor kelas Scanner dari java.util untuk membaca input dari pengguna

public class App { // Mendeklarasikan kelas App yang bersifat public
    public static void main(String[] args) { // Mendeklarasikan metode main yang merupakan titik masuk program
        Akademik daftarAkademik = new Akademik(); // Membuat objek baru dari kelas Akademik
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna
        int pilihan; // Mendeklarasikan variabel untuk menyimpan pilihan menu dari pengguna

        do { // Memulai blok do-while untuk menampilkan menu dan memproses input pengguna secara berulang
            System.out.println("\nMenu:"); // Menampilkan menu
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Cari Mahasiswa");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("5. Tambah Mahasiswa ke Prodi");
            System.out.println("6. Tampilkan Daftar Mahasiswa Berdasarkan Prodi");
            System.out.println("7. Keluar");
            System.out.print("Pilih opsi: "); // Menampilkan prompt untuk input pengguna
            pilihan = scanner.nextInt(); // Membaca pilihan dari pengguna
            scanner.nextLine(); // Mengkonsumsi newline karakter setelah nextInt()

            switch (pilihan) { // Memulai switch-case untuk memproses pilihan pengguna
                case 1: // Kasus untuk menambahkan mahasiswa
                    System.out.print("Masukkan nama mahasiswa: "); // Meminta input nama mahasiswa
                    String nama = scanner.nextLine(); // Membaca nama mahasiswa
                    System.out.print("Masukkan NIM mahasiswa: "); // Meminta input NIM mahasiswa
                    String nim = scanner.nextLine(); // Membaca NIM mahasiswa
                    Mahasiswa mahasiswa = new Mahasiswa(nama, nim); // Membuat objek Mahasiswa baru
                    daftarAkademik.AddMahasiswa(mahasiswa); // Menambahkan mahasiswa ke daftar
                    break; // Mengakhiri kasus

                case 2: // Kasus untuk menghapus mahasiswa
                    System.out.print("Masukkan NIM mahasiswa yang akan dihapus: "); // Meminta input NIM mahasiswa yang akan dihapus
                    nim = scanner.nextLine(); // Membaca NIM mahasiswa
                    daftarAkademik.DelMahasiswa(nim); // Menghapus mahasiswa berdasarkan NIM
                    break; // Mengakhiri kasus

                case 3: // Kasus untuk mencari mahasiswa
                    System.out.print("Masukkan NIM mahasiswa yang dicari: "); // Meminta input NIM mahasiswa yang dicari
                    nim = scanner.nextLine(); // Membaca NIM mahasiswa
                    daftarAkademik.SearchMahasiswa(nim); // Mencari mahasiswa berdasarkan NIM
                    break; // Mengakhiri kasus

                case 4: // Kasus untuk menampilkan daftar mahasiswa
                    daftarAkademik.tampilkanDaftarMahasiswa(); // Menampilkan semua mahasiswa
                    break; // Mengakhiri kasus

                case 5: // Kasus untuk menambahkan mahasiswa ke prodi
                    System.out.print("Masukkan NIM mahasiswa: "); // Meminta input NIM mahasiswa
                    nim = scanner.nextLine(); // Membaca NIM mahasiswa
                    System.out.println("Pilih prodi (1: Informatika, 2: Industri, 3: Mesin): "); // Meminta input pilihan prodi
                    int pilihanProdi = scanner.nextInt(); // Membaca pilihan prodi
                    scanner.nextLine(); // Mengkonsumsi newline karakter setelah nextInt()
                    Prodi prodi; // Mendeklarasikan variabel untuk menyimpan objek Prodi
                    switch (pilihanProdi) { // Memulai switch-case untuk memilih prodi
                        case 1: // Kasus untuk prodi Informatika
                            prodi = Prodi.INFORMATIKA; // Mengatur prodi sebagai Informatika
                            break; // Mengakhiri kasus
                        case 2: // Kasus untuk prodi Industri
                            prodi = Prodi.INDUSTRI; // Mengatur prodi sebagai Industri
                            break; // Mengakhiri kasus
                        case 3: // Kasus untuk prodi Mesin
                            prodi = Prodi.MESIN; // Mengatur prodi sebagai Mesin
                            break; // Mengakhiri kasus
                        default: // Kasus default jika pilihan prodi tidak valid
                            System.out.println("Prodi tidak valid."); // Menampilkan pesan prodi tidak valid
                            continue; // Melanjutkan ke iterasi berikutnya dari loop do-while
                    }
                    daftarAkademik.AddMahasiswaKeProdi(nim, prodi); // Menambahkan mahasiswa ke prodi yang dipilih
                    break; // Mengakhiri kasus

                case 6: // Kasus untuk menampilkan daftar mahasiswa berdasarkan prodi
                    System.out.println("Pilih prodi (1: Informatika, 2: Industri, 3: Mesin): "); // Meminta input pilihan prodi
                    pilihanProdi = scanner.nextInt(); // Membaca pilihan prodi
                    scanner.nextLine(); // Mengkonsumsi newline karakter setelah nextInt()
                    switch (pilihanProdi) { // Memulai switch-case untuk memilih prodi
                        case 1: // Kasus untuk prodi Informatika
                            daftarAkademik.tampilkanDaftarMahasiswaBerdasarkanProdi(Prodi.INFORMATIKA); // Menampilkan daftar mahasiswa prodi Informatika
                            break; // Mengakhiri kasus
                        case 2: // Kasus untuk prodi Industri
                            daftarAkademik.tampilkanDaftarMahasiswaBerdasarkanProdi(Prodi.INDUSTRI); // Menampilkan daftar mahasiswa prodi Industri
                            break; // Mengakhiri kasus
                        case 3: // Kasus untuk prodi Mesin
                            daftarAkademik.tampilkanDaftarMahasiswaBerdasarkanProdi(Prodi.MESIN); // Menampilkan daftar mahasiswa prodi Mesin
                            break; // Mengakhiri kasus
                        default: // Kasus default jika pilihan prodi tidak valid
                            System.out.println("Prodi tidak valid."); // Menampilkan pesan prodi tidak valid
                    }
                    break; // Mengakhiri kasus

                case 7: // Kasus untuk keluar dari program
                    System.out.println("Keluar dari program."); // Menampilkan pesan keluar dari program
                    break; // Mengakhiri kasus

                default: // Kasus default jika pilihan menu tidak valid
                    System.out.println("Opsi tidak valid, coba lagi."); // Menampilkan pesan opsi tidak valid
            }
        } while (pilihan != 7); // Kondisi untuk melanjutkan loop selama pilihan bukan 7 (Keluar)

        scanner.close(); // Menutup objek Scanner untuk melepaskan sumber daya yang digunakan
    }
}
