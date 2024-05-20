package TugasBesar;

import java.util.ArrayList;
import java.util.List;

public class Akademik {
    private List<Mahasiswa> daftarMahasiswa;

    public Akademik() {
        this.daftarMahasiswa = new ArrayList<>();
    }

    public void AddMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
        System.out.println("Mahasiswa berhasil ditambahkan.");
    }

    public void DelMahasiswa(String nim) {
        Mahasiswa mahasiswaDihapus = null;
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getNim().equals(nim)) {
                mahasiswaDihapus = mahasiswa;
                break;
            }
        }

        if (mahasiswaDihapus != null) {
            daftarMahasiswa.remove(mahasiswaDihapus);
            System.out.println("Mahasiswa dengan NIM " + nim + " berhasil dihapus.");
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    public void SearchMahasiswa(String nim) {
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getNim().equals(nim)) {
                System.out.println("Mahasiswa ditemukan: " + mahasiswa);
                return;
            }
        }
        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
    }

    public void tampilkanDaftarMahasiswa() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Daftar mahasiswa kosong.");
        } else {
            System.out.println("Daftar Mahasiswa:");
            for (Mahasiswa mahasiswa : daftarMahasiswa) {
                System.out.println(mahasiswa);
            }
        }
    }
}