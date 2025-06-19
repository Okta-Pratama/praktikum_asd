
import java.util.Scanner;
public class SLLMain22 {
    public static Mahasiswa22 inputMahasiswa(Scanner sc) {
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
            return new Mahasiswa22(nim, nama, kelas, ipk);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList22 sll = new SingleLinkedList22();
        String lanjut;
        
        do {
            System.out.println("\n=== MENU PENAMBAHAN DATA MAHASISWA ===");
            System.out.println("1. Tambah di awal (addFirst)");
            System.out.println("2. Tambah di akhir (addLast)");
            System.out.println("3. Tambah setelah nama tertentu (insertAfter)");
            System.out.println("4. Tambah di posisi/index tertentu (insertAt)");
            System.out.print("Pilih menu (1-4): ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1: {
                    Mahasiswa22 mhs = inputMahasiswa(sc);
                    sll.addFirst(mhs);
                    break;
                }
                case 2: {
                    Mahasiswa22 mhs = inputMahasiswa(sc);
                    sll.addLast(mhs);
                    break;
                }
                case 3: {
                    Mahasiswa22 mhs = inputMahasiswa(sc);
                    System.out.print("Masukkan nama mahasiswa sebagai acuan insertAfter: ");
                    String key = sc.nextLine();
                    sll.insertAfter(key, mhs);
                    break;
                }
                case 4: {
                    Mahasiswa22 mhs = inputMahasiswa(sc);
                    System.out.print("Masukkan index (dimulai dari 0): ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    sll.insertAt(index, mhs);
                    break;
                }
                default: System.out.println("Pilihan menu tidak valid.");
            }

            System.out.print("Ingin menambah data lagi? (y/n): ");
            lanjut = sc.nextLine();

        } while (lanjut.equalsIgnoreCase("y"));

        System.out.println("\n=== DATA MAHASISWA DALAM LINKED LIST ===");
        sll.print();
        
        // Mahasiswa22 mhs1 = new Mahasiswa22("24212200", "Alvaro", "1A", 4.0);
        // Mahasiswa22 mhs2 = new Mahasiswa22("23212201", "Bimon", "2B", 3.8);
        // Mahasiswa22 mhs3 = new Mahasiswa22("22212202", "Cintia", "3C", 3.5);
        // Mahasiswa22 mhs4 = new Mahasiswa22("21212203", "Dirga", "4D", 3.6);

        // sll.print();
        // sll.addFirst(mhs4);
        // sll.print();
        // sll.addLast(mhs1);
        // sll.print();
        // sll.insertAfter("Dirga", mhs3);
        // sll.insertAt(2, mhs2);
        // sll.print();

        // System.out.println("data index 1 : ");
        // sll.getData(1);

        // System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        // System.out.println();

        // sll.removeFirst();
        // sll.removeLast();
        // sll.print();
        // sll.removeAt(0);
        // sll.print();
    }
}
