package jobsheet_10;

public class Mahasiswa22 {
    String nim;
    String nama;
    String prodi;
    String kelas;
    public Mahasiswa22() {
    }
    public Mahasiswa22(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this. kelas = kelas;
    }
    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}