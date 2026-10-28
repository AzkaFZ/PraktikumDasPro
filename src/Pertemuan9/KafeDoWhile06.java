package Pertemuan9;
//  hargaKopi = 10000 + (6 mod 5) × 1000 → gantikan Rp12.000 pada soal | 10000 + 1 x 1000 = 11000
// hargaTeh = 5000 + (6 mod 4) × 1000 → gantikan Rp7.000 pada soal | 5000 + 2 x 1000 = 7000
// hargaRoti = 15000 + (6 mod 6) × 1000 → gantikan Rp20.000 pada soal 15000 + 0 x 1000 = 15000
import java.util.Scanner;

public class KafeDoWhile06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi=11000, hargaTeh=7000, hargaRoti=15000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            int totalHarga = (kopi*hargaKopi) + (teh*hargaTeh) + (roti*hargaRoti);
            System.out.println("Total harga yang harus dibayar: "+totalHarga);
        } while (true);
        sc.close();
    }
}