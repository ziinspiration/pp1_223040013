package TugasBesar;

public class Mahasiswa { // Deklarasi kelas publik bernama Mahasiswa
    private String nama; // Deklarasi variabel instance nama dengan akses privat
    private String nim; // Deklarasi variabel instance nim dengan akses privat

    // Konstruktor untuk menginisialisasi objek Mahasiswa dengan nama dan nim
    public Mahasiswa(String nama, String nim) {
        this.nama = nama; // Menginisialisasi variabel nama
        this.nim = nim; // Menginisialisasi variabel nim
    }

    // Getter untuk mengambil nilai nama
    public String getNama() {
        return nama; // Mengembalikan nilai nama
    }

    // Getter untuk mengambil nilai nim
    public String getNim() {
        return nim; // Mengembalikan nilai nim
    }

    @Override
    public String toString() { // Override metode toString untuk memberikan representasi string dari objek Mahasiswa
        return "Nama: " + nama + ", NIM: " + nim; // Mengembalikan representasi string dari objek Mahasiswa
    }
}
