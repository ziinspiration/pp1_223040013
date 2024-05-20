package TugasBesar;

public class Mahasiswa {
    private String nama;
    private String nim;

//    Setter
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

//    Getter
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", NIM: " + nim;
    }
}