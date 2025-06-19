package jobsheet_7;

public class Dosen22 {
    public String kode;
    public String nama;
    public boolean jenisKelamin;
    public int usia;
    public Dosen22() {
    }
    public Dosen22(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }
    public void tampilkanInformasi() {
    System.out.println("Kode           : " + kode);
    System.out.println("Nama           : " + nama);
    System.out.println("Jenis Kelamin  : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
    System.out.println("Usia           : " + usia);
    System.out.println("-----------------------------");
    }
}
