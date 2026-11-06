package Pertemuan10;
import java.util.Scanner;

public class Tugas2_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, hasilKali, jmlTotal = 0;

        do {
            System.out.print("Masukkan nilai n: ");
            n = sc.nextInt();
            if (n < 3) {
                System.out.println("Minimal nilai n adalah 3. Ulangi input!");
            } else {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        hasilKali = i * j;
                        System.out.printf("%4d", hasilKali);

                        jmlTotal += hasilKali;
                    }
                    System.out.println();
                }
            }
        } while (n < 3);

        System.out.println("Jumlah seluruh angka: " + jmlTotal);
        sc.close();
    }

}