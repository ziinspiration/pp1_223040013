package TugasBesar;

import java.util.ArrayList; // Import kelas ArrayList
import java.util.List; // Import interface List

public class Akademik { // Deklarasi kelas publik
    private List<Mahasiswa> daftarMahasiswa; // Deklarasi variabel daftarMahasiswa sebagai daftar objek Mahasiswa

    public Akademik() { // Konstruktor kelas Akademik
        this.daftarMahasiswa = new ArrayList<>(); // Inisialisasi daftarMahasiswa sebagai ArrayList kosong
    }

    public void AddMahasiswa(Mahasiswa mahasiswa) { // Metode untuk menambahkan Mahasiswa ke daftar
        daftarMahasiswa.add(mahasiswa); // Menambahkan objek mahasiswa ke daftarMahasiswa
        System.out.println("Mahasiswa berhasil ditambahkan."); // Menampilkan pesan konfirmasi
    }

    public void DelMahasiswa(String nim) { // Metode untuk menghapus Mahasiswa berdasarkan NIM
        Mahasiswa mahasiswaDihapus = null; // Inisialisasi variabel mahasiswaDihapus sebagai null
        for (Mahasiswa mahasiswa : daftarMahasiswa) { // Loop untuk mencari Mahasiswa dengan NIM tertentu
            if (mahasiswa.getNim().equals(nim)) { // Jika NIM Mahasiswa cocok
                mahasiswaDihapus = mahasiswa; // Set mahasiswaDihapus ke Mahasiswa yang ditemukan
                break; // Keluar dari loop
            }
        }

        if (mahasiswaDihapus != null) { // Jika Mahasiswa ditemukan
            daftarMahasiswa.remove(mahasiswaDihapus); // Hapus Mahasiswa dari daftarMahasiswa
            System.out.println("Mahasiswa dengan NIM " + nim + " berhasil dihapus."); // Tampilkan pesan konfirmasi
        } else { // Jika Mahasiswa tidak ditemukan
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan."); // Tampilkan pesan kesalahan
        }
    }

    public void SearchMahasiswa(String nim) { // Metode untuk mencari Mahasiswa berdasarkan NIM
        for (Mahasiswa mahasiswa : daftarMahasiswa) { // Loop untuk mencari Mahasiswa dengan NIM tertentu
            if (mahasiswa.getNim().equals(nim)) { // Jika NIM Mahasiswa cocok
                System.out.println("Mahasiswa ditemukan: " + mahasiswa); // Tampilkan Mahasiswa yang ditemukan
                return; // Keluar dari metode
            }
        }
        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan."); // Tampilkan pesan jika tidak ditemukan
    }

    public void tampilkanDaftarMahasiswa() { // Metode untuk menampilkan daftar Mahasiswa
        if (daftarMahasiswa.isEmpty()) { // Jika daftarMahasiswa kosong
            System.out.println("Daftar mahasiswa kosong."); // Tampilkan pesan bahwa daftar kosong
        } else { // Jika daftarMahasiswa tidak kosong
            System.out.println("Daftar Mahasiswa:"); // Tampilkan header daftar Mahasiswa
            for (Mahasiswa mahasiswa : daftarMahasiswa) { // Loop untuk setiap Mahasiswa dalam daftar
                System.out.println(mahasiswa); // Tampilkan Mahasiswa
            }
        }
    }
}
