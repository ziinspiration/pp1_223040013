package TugasBesar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Akademik {
    private List<Mahasiswa> daftarMahasiswa;
    private Map<Prodi, List<Mahasiswa>> daftarMahasiswaProdi;

    public Akademik() {
        this.daftarMahasiswa = new ArrayList<>();
        this.daftarMahasiswaProdi = new HashMap<>();
        for (Prodi prodi : Prodi.values()) {
            daftarMahasiswaProdi.put(prodi, new ArrayList<>());
        }
    }

    public void AddMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
        System.out.println("Mahasiswa berhasil ditambahkan.");
    }

    public void AddMahasiswaKeProdi(String nim, Prodi prodi) {
        Mahasiswa mahasiswa = findMahasiswaByNim(nim);
        if (mahasiswa != null) {
            daftarMahasiswaProdi.get(prodi).add(mahasiswa);
            System.out.println("Mahasiswa berhasil ditambahkan ke prodi " + prodi);
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    public void DelMahasiswa(String nim) {
        Mahasiswa mahasiswaDihapus = findMahasiswaByNim(nim);

        if (mahasiswaDihapus != null) {
            daftarMahasiswa.remove(mahasiswaDihapus);
            for (List<Mahasiswa> mahasiswaList : daftarMahasiswaProdi.values()) {
                mahasiswaList.remove(mahasiswaDihapus);
            }
            System.out.println("Mahasiswa dengan NIM " + nim + " berhasil dihapus.");
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    public void SearchMahasiswa(String nim) {
        Mahasiswa mahasiswa = findMahasiswaByNim(nim);
        if (mahasiswa != null) {
            System.out.println("Mahasiswa ditemukan: " + mahasiswa);
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
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

    public void tampilkanDaftarMahasiswaBerdasarkanProdi(Prodi prodi) {
        List<Mahasiswa> mahasiswaProdi = daftarMahasiswaProdi.get(prodi);
        if (mahasiswaProdi.isEmpty()) {
            System.out.println("Daftar mahasiswa untuk prodi " + prodi + " kosong.");
        } else {
            System.out.println("Daftar Mahasiswa untuk prodi " + prodi + ":");
            for (Mahasiswa mahasiswa : mahasiswaProdi) {
                System.out.println(mahasiswa);
            }
        }
    }

    private Mahasiswa findMahasiswaByNim(String nim) {
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getNim().equals(nim)) {
                return mahasiswa;
            }
        }
        return null;
    }
}
