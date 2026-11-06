package Pertemuan10;
import java.util.Scanner;

public class Tugas3_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlToko;
        int jmlBrg = 0;
        int jmlPelanggan;

        int totalBarang = 0;

        int bnykBrgToko = 0;
        int maxBrg = -1;
        int noTokoTerbnyk = 0;

        do {
            System.out.print("Masukkan jumlah toko : ");
            jmlToko = sc.nextInt();
            if (jmlToko < 1) {
                System.out.println("Toko harus minimal 1 !");
            }
        } while (jmlToko < 1);

        for (int i = 1; i <= jmlToko; i++) {
            do {
                System.out.println();
                System.out.print("Masukkan jumlah pelanggan toko ke " + i + " : ");
                jmlPelanggan = sc.nextInt();
                if (jmlPelanggan < 0) {
                    System.out.println("pelanggan tidak boleh tidak negatif");
                }
            } while (jmlPelanggan < 0);

            for (int j = 1; j <= jmlPelanggan; j++) {
                do {
                    System.out.print("\t-> Jumlah barang pelanggan ke " + j + " : ");
                    jmlBrg = sc.nextInt();
                    if (jmlBrg < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif");
                    }
                } while (jmlBrg < 0);
                totalBarang += jmlBrg;
                bnykBrgToko += jmlBrg;
            }

            System.out.println("Toko " + i + " - pelanggan: " + jmlPelanggan + ", total barang: " + bnykBrgToko);

            if (i == 1 || bnykBrgToko > maxBrg) {
                maxBrg = bnykBrgToko;
                noTokoTerbnyk = i;
            }

            bnykBrgToko = 0;

        }
        System.out.println();
        System.out.println("Total barang seluruh toko: " + totalBarang);
        System.out.println("Toko dengan barang terbanyak: " + noTokoTerbnyk);
        sc.close();
    }
}