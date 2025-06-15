import java.util.Scanner;
class Faktorial {
    public static int faktorialBF(int n) {
      int hasil = 1;
      for (int i = 2; i <= n; i++) {
          hasil *= i;
      }
      return hasil;
  }

    public static int faktorialDC(int n) {
      if (n == 0 || n == 1) {
          return 1;
      }
      int tengah = n / 2;
      return faktorialDC(tengah) * faktorialDC(n - tengah) * kombinasi(n, tengah);
  }

    private static int kombinasi(int n, int tengah) {
      int hasil = 1;
      for (int i = tengah + 1; i <= n; i++) {
          hasil *= i;
      }
      return hasil;
  }

  public static void main(String[] args) {
      int n ;
      Scanner input = new Scanner(System.in);
      System.out.print("Masukkan bilangan: ");
      n = input.nextInt();
      System.out.println("Faktorial " + n + " dengan Brute Force: " + faktorialBF(n));
      System.out.println("Faktorial " + n + " dengan Divide and Conquer: " + faktorialDC(n));
  }
}
