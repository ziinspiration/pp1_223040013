package TugasBesar; // Mendeklarasikan bahwa kelas Akademik berada dalam package bernama TugasBesar

import java.util.ArrayList; // Mengimpor kelas ArrayList dari java.util untuk digunakan dalam program
import java.util.HashMap; // Mengimpor kelas HashMap dari java.util untuk digunakan dalam program
import java.util.List; // Mengimpor interface List dari java.util untuk digunakan dalam program
import java.util.Map; // Mengimpor interface Map dari java.util untuk digunakan dalam program

public class Akademik { // Mendeklarasikan kelas Akademik yang bersifat public
    private List<Mahasiswa> daftarMahasiswa; // Mendeklarasikan atribut daftarMahasiswa bertipe List yang menyimpan objek Mahasiswa
    private Map<Prodi, List<Mahasiswa>> daftarMahasiswaProdi; // Mendeklarasikan atribut daftarMahasiswaProdi bertipe Map yang memetakan objek Prodi ke List objek Mahasiswa

    public Akademik() { // Konstruktor kelas Akademik
        this.daftarMahasiswa = new ArrayList<>(); // Menginisialisasi daftarMahasiswa sebagai ArrayList kosong
        this.daftarMahasiswaProdi = new HashMap<>(); // Menginisialisasi daftarMahasiswaProdi sebagai HashMap kosong
        for (Prodi prodi : Prodi.values()) { // Iterasi melalui setiap nilai enum Prodi
            daftarMahasiswaProdi.put(prodi, new ArrayList<>()); // Menambahkan entry baru ke daftarMahasiswaProdi dengan kunci sebagai Prodi dan nilai sebagai ArrayList kosong
        }
    }

    public void AddMahasiswa(Mahasiswa mahasiswa) { // Metode untuk menambahkan objek Mahasiswa ke daftarMahasiswa
        daftarMahasiswa.add(mahasiswa); // Menambahkan objek Mahasiswa ke daftarMahasiswa
        System.out.println("Mahasiswa berhasil ditambahkan."); // Mencetak pesan bahwa mahasiswa berhasil ditambahkan
    }

    public void AddMahasiswaKeProdi(String nim, Prodi prodi) { // Metode untuk menambahkan objek Mahasiswa ke daftarMahasiswaProdi berdasarkan NIM dan Prodi
        Mahasiswa mahasiswa = findMahasiswaByNim(nim); // Mencari objek Mahasiswa berdasarkan NIM
        if (mahasiswa != null) { // Jika Mahasiswa ditemukan
            daftarMahasiswaProdi.get(prodi).add(mahasiswa); // Menambahkan Mahasiswa ke daftarMahasiswaProdi yang sesuai dengan Prodi
            System.out.println("Mahasiswa berhasil ditambahkan ke prodi " + prodi); // Mencetak pesan bahwa mahasiswa berhasil ditambahkan ke prodi
        } else { // Jika Mahasiswa tidak ditemukan
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan."); // Mencetak pesan bahwa mahasiswa dengan NIM tersebut tidak ditemukan
        }
    }

    public void DelMahasiswa(String nim) { // Metode untuk menghapus objek Mahasiswa dari daftarMahasiswa dan daftarMahasiswaProdi berdasarkan NIM
        Mahasiswa mahasiswaDihapus = findMahasiswaByNim(nim); // Mencari objek Mahasiswa berdasarkan NIM

        if (mahasiswaDihapus != null) { // Jika Mahasiswa ditemukan
            daftarMahasiswa.remove(mahasiswaDihapus); // Menghapus Mahasiswa dari daftarMahasiswa
            for (List<Mahasiswa> mahasiswaList : daftarMahasiswaProdi.values()) { // Iterasi melalui setiap List Mahasiswa dalam daftarMahasiswaProdi
                mahasiswaList.remove(mahasiswaDihapus); // Menghapus Mahasiswa dari setiap List yang sesuai
            }
            System.out.println("Mahasiswa dengan NIM " + nim + " berhasil dihapus."); // Mencetak pesan bahwa mahasiswa berhasil dihapus
        } else { // Jika Mahasiswa tidak ditemukan
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan."); // Mencetak pesan bahwa mahasiswa dengan NIM tersebut tidak ditemukan
        }
    }

    public void SearchMahasiswa(String nim) { // Metode untuk mencari objek Mahasiswa berdasarkan NIM
        Mahasiswa mahasiswa = findMahasiswaByNim(nim); // Mencari objek Mahasiswa berdasarkan NIM
        if (mahasiswa != null) { // Jika Mahasiswa ditemukan
            System.out.println("Mahasiswa ditemukan: " + mahasiswa); // Mencetak pesan bahwa mahasiswa ditemukan beserta detailnya
        } else { // Jika Mahasiswa tidak ditemukan
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan."); // Mencetak pesan bahwa mahasiswa dengan NIM tersebut tidak ditemukan
        }
    }

    public void tampilkanDaftarMahasiswa() { // Metode untuk menampilkan daftar semua Mahasiswa
        if (daftarMahasiswa.isEmpty()) { // Jika daftarMahasiswa kosong
            System.out.println("Daftar mahasiswa kosong."); // Mencetak pesan bahwa daftar mahasiswa kosong
        } else { // Jika daftarMahasiswa tidak kosong
            System.out.println("Daftar Mahasiswa:"); // Mencetak header daftar mahasiswa
            for (Mahasiswa mahasiswa : daftarMahasiswa) { // Iterasi melalui setiap Mahasiswa dalam daftarMahasiswa
                System.out.println(mahasiswa); // Mencetak detail setiap Mahasiswa
            }
        }
    }

    public void tampilkanDaftarMahasiswaBerdasarkanProdi(Prodi prodi) { // Metode untuk menampilkan daftar Mahasiswa berdasarkan Prodi tertentu
        List<Mahasiswa> mahasiswaProdi = daftarMahasiswaProdi.get(prodi); // Mendapatkan List Mahasiswa yang sesuai dengan Prodi
        if (mahasiswaProdi.isEmpty()) { // Jika List Mahasiswa untuk Prodi tersebut kosong
            System.out.println("Daftar mahasiswa untuk prodi " + prodi + " kosong."); // Mencetak pesan bahwa daftar mahasiswa untuk prodi tersebut kosong
        } else { // Jika List Mahasiswa untuk Prodi tersebut tidak kosong
            System.out.println("Daftar Mahasiswa untuk prodi " + prodi + ":"); // Mencetak header daftar mahasiswa untuk prodi tersebut
            for (Mahasiswa mahasiswa : mahasiswaProdi) { // Iterasi melalui setiap Mahasiswa dalam List yang sesuai dengan Prodi
                System.out.println(mahasiswa); // Mencetak detail setiap Mahasiswa
            }
        }
    }

    private Mahasiswa findMahasiswaByNim(String nim) { // Metode private untuk mencari objek Mahasiswa berdasarkan NIM
        for (Mahasiswa mahasiswa : daftarMahasiswa) { // Iterasi melalui setiap Mahasiswa dalam daftarMahasiswa
            if (mahasiswa.getNim().equals(nim)) { // Jika NIM Mahasiswa sesuai dengan NIM yang dicari
                return mahasiswa; // Mengembalikan objek Mahasiswa yang ditemukan
            }
        }
        return null; // Mengembalikan null jika Mahasiswa tidak ditemukan
    }
}
