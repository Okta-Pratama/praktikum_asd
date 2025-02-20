import java.util.Scanner;

public class nimMhs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan NIM: ");
        String nim = input.next();
        int n = Integer.parseInt(nim.substring(nim.length() - 1));
        if (n < 10) n += 10;
        
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) continue;
            System.out.print(i % 2 == 0 ? i + " " : "* ");
        }
        
        input.close();
    }
}