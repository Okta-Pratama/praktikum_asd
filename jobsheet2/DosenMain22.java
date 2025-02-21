public class DosenMain22 {
    public static void main(String[] args) {
        Dosen22 dsn1 = new Dosen22();
        dsn1.idDosen = "101";
        dsn1.nama = "Vivi Nur Wijayaningrum, S.Kom, M.Kom";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2009;
        dsn1.bidangKeahlian = "Algoritma dan Struktur Dasar";

        dsn1.tampilkanInformasi();
        dsn1.hitungMasakerja(2025);
        System.out.println();
        dsn1.ubahKeahlian("Dasar Pemrograman");
        dsn1.tampilkanInformasi();
        System.out.println();

        Dosen22 dsn2 = new Dosen22("202", "Vit Zuraida, S.Kom., M.Kom.", false, 2012, "Basis Data");
        dsn2.tampilkanInformasi();
        System.out.println();
        dsn2.setStatusAktif(true);
        dsn2.tampilkanInformasi();
        dsn2.hitungMasakerja(2025);
    }
}
