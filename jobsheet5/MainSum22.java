
import java.util.Scanner;
public class MainSum22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        Sum22 sm = new Sum22(elemen);
        for(int i=0;i<elemen;i++) {
            System.out.print("Masukkan keuntungan ke-" +(i+1)+": ");
            sm.keuntungan[i] = input.nextDouble();
        }
        System.out.println("Total keuntungan menggunakan Bruteforce: "+sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: "+sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}
