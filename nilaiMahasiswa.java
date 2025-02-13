import java.util.Scanner;

public class nilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tugas, kuis, uts, uas, nilaiAkhir;
        String nilaiHuruf, keterangan;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("================================================");
        System.out.print("Masukkan nilai tugas: ");
        tugas = input.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        kuis = input.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        uts = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        uas = input.nextDouble();
        System.out.println("================================================");
        
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid");
        } else {
            nilaiAkhir = ((tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3));
            
            if (nilaiAkhir >= 80) nilaiHuruf = "A";
            else if (nilaiAkhir >= 75) nilaiHuruf = "B+";
            else if (nilaiAkhir >= 70) nilaiHuruf = "B";
            else if (nilaiAkhir >= 65) nilaiHuruf = "C+";
            else if (nilaiAkhir >= 60) nilaiHuruf = "C";
            else if (nilaiAkhir >= 50) nilaiHuruf = "D";
            else nilaiHuruf = "E";
            
            keterangan = (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) ? "LULUS" : "TIDAK LULUS";
            
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("Keterangan: " + keterangan);
        }
        input.close();
    }
}