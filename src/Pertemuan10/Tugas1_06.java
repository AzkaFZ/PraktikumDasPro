package Pertemuan10;
import java.util.Scanner;

public class Tugas1_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, jmlBilangan = 0;

        System.out.print("Masukkan nilai n = ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                jmlBilangan ++;
            }
            System.out.println();
        }
        System.out.println("Total angka yang tercetak : " + jmlBilangan);
        sc.close();
    }
}