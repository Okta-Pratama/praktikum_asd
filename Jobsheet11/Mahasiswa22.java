
public class Mahasiswa22 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    Mahasiswa22() {
    }
    Mahasiswa22(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }
    public void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + ipk);
    }
}
