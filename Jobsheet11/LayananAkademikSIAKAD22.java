
import java.util.Scanner;
public class LayananAkademikSIAKAD22 {
    public static void main(String[] args) {
        AntrianLayanan22 antri = new AntrianLayanan22(5);
        Scanner sc = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Cek Antrian Kosong");
            System.out.println("2. Cek Antrian Penuh");
            System.out.println("3. Mengosongkan Antrian");
            System.out.println("4. Menambah Antrian");
            System.out.println("5. Memanggil Antrian");
            System.out.println("6. Menampilkan Antrian Terdepan");
            System.out.println("7. Menampilkan Antrian Terakhir");
            System.out.println("8. Cetak Jumlah Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();
            switch (pilihan) {
                case 1:
                    if (antri.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Antrian tidak kosong.");                       
                    }
                    break;
                case 2:
                    if (antri.isFull()) {
                        System.out.println("Antrian sudah penuh.");
                    } else {
                        System.out.println("Antrian belum penuh.");
                    }
                    break;
                case 3:
                    antri.clear();
                    break;
                case 4:
                    if (antri.isFull()) {
                        System.out.println("Antrian sudah penuh. Tidak bisa menambahkan mahasiswa.");
                        break;
                    }
                    System.out.println("Masukkan data mahasiswa");
                    System.out.print("Masukkan NIM     : ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama    : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Kelas   : ");
                    String kelas = sc.nextLine();
                    System.out.print("Masukkan IPK     : ");
                    String dummy = sc.nextLine();
                    double ipk = Double.parseDouble(dummy);
                    System.out.println("-----------------------------");
                    Mahasiswa22 mhs = new Mahasiswa22(nim, nama, kelas, ipk);
                    antri.addLast(mhs);
                    System.out.println("Data berhasil ditambahkan");
                    break;
                case 5:
                    Mahasiswa22 mhsKeluar = antri.removeFirst();
                    if (mhsKeluar != null) {
                        System.out.println("Mahasiswa berikut dipanggil dari antrian:");
                        mhsKeluar.tampilInformasi();
                    }
                    break;
                case 6:
                    antri.tampilDepan();
                    break;
                case 7:
                    antri.tampilAkhir();
                    break;
                case 8:
                    antri.getAntrian();
                    break;
                case 0: 
                    System.out.println("Terimakasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
