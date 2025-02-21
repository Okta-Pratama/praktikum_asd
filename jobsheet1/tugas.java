import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
      // Kode plat dan kota yang sesuai
      char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
      char[][] KOTA = {
        {'B', 'A', 'N', 'T', 'E', 'N'},
        {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
        {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
        {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
        {'B', 'O', 'G', 'O', 'R'},
        {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
        {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
        {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
        {'M', 'A', 'L', 'A', 'N', 'G'},
        {'T', 'E', 'G', 'A', 'L'},
        {'B', 'A', 'N', 'D', 'U', 'N', 'G'}
      };

      Scanner scanner = new Scanner(System.in);
      System.out.print("Masukkan kode plat mobil: ");
      char inputKode = scanner.nextLine().charAt(0);

      boolean ditemukan = false;
    for (int i = 0; i < KODE.length; i++) {
      if (KODE[i] == Character.toUpperCase(inputKode)) {
          System.out.println("Nama kota: " + new String(KOTA[i]));
          ditemukan = true;
          break;
      }
    }
    if (!ditemukan) {
      System.out.println("Kode plat tidak ditemukan.");
    }

    scanner.close();
  }
}
