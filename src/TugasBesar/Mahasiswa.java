package TugasBesar; // Mendeklarasikan bahwa kelas Mahasiswa berada dalam package bernama TugasBesar

public class Mahasiswa { // Mendeklarasikan kelas Mahasiswa yang bersifat public
    private String nama; // Mendefinisikan atribut 'nama' bertipe String dengan akses private
    private String nim; // Mendefinisikan atribut 'nim' bertipe String dengan akses private

    public Mahasiswa(String nama, String nim) { // Konstruktor kelas Mahasiswa yang menerima dua parameter
        this.nama = nama; // Menginisialisasi atribut 'nama' dengan nilai parameter 'nama'
        this.nim = nim; // Menginisialisasi atribut 'nim' dengan nilai parameter 'nim'
    }

    public String getNama() { // Metode getter untuk mendapatkan nilai 'nama'
        return nama; // Mengembalikan nilai atribut 'nama'
    }

    public String getNim() { // Metode getter untuk mendapatkan nilai 'nim'
        return nim; // Mengembalikan nilai atribut 'nim'
    }

    @Override // Annotation untuk menunjukkan bahwa metode ini mengoverride metode dari superclass
    public String toString() { // Metode yang mengembalikan representasi string dari objek Mahasiswa
        return "Nama: " + nama + ", NIM: " + nim; // Mengembalikan string yang berisi 'nama' dan 'nim'
    }
}
