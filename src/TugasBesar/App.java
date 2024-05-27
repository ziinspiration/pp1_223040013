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
            System.out.println("5. Tambah Mahasiswa ke Prodi");
            System.out.println("6. Tampilkan Daftar Mahasiswa Berdasarkan Prodi");
            System.out.println("7. Keluar");
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
                    System.out.print("Masukkan NIM mahasiswa: ");
                    nim = scanner.nextLine();
                    System.out.println("Pilih prodi (1: Informatika, 2: Industri, 3: Mesin): ");
                    int pilihanProdi = scanner.nextInt();
                    scanner.nextLine();
                    Prodi prodi;
                    switch (pilihanProdi) {
                        case 1:
                            prodi = Prodi.INFORMATIKA;
                            break;
                        case 2:
                            prodi = Prodi.INDUSTRI;
                            break;
                        case 3:
                            prodi = Prodi.MESIN;
                            break;
                        default:
                            System.out.println("Prodi tidak valid.");
                            continue;
                    }
                    daftarAkademik.AddMahasiswaKeProdi(nim, prodi);
                    break;
                case 6:
                    System.out.println("Pilih prodi (1: Informatika, 2: Industri, 3: Mesin): ");
                    pilihanProdi = scanner.nextInt();
                    scanner.nextLine();
                    switch (pilihanProdi) {
                        case 1:
                            daftarAkademik.tampilkanDaftarMahasiswaBerdasarkanProdi(Prodi.INFORMATIKA);
                            break;
                        case 2:
                            daftarAkademik.tampilkanDaftarMahasiswaBerdasarkanProdi(Prodi.INDUSTRI);
                            break;
                        case 3:
                            daftarAkademik.tampilkanDaftarMahasiswaBerdasarkanProdi(Prodi.MESIN);
                            break;
                        default:
                            System.out.println("Prodi tidak valid.");
                    }
                    break;
                case 7:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Opsi tidak valid, coba lagi.");
            }
        } while (pilihan != 7);

        scanner.close();
    }
}
