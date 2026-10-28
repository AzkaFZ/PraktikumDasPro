package Pertemuan9;
// Harga tiket = 40000 + (P mod 6) × 2000 → gantikan Rp50.000 pada soal
// Syarat diskon pertama = lebih dari (3 + (P mod 3)) tiket, dengan diskon (8 + (P mod 5))% → gantikan "lebih dari 4 tiket, diskon 10%"
// Syarat diskon kedua = lebih dari (8 + (P mod 4)) tiket, dengan diskon (15 + (P mod 4))% → gantikan "lebih dari 10 tiket, diskon 15%"
import java.util.Scanner;

public class Bioskop06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int harga=40000;
        int tiket=0;
        double diskonHarga, hargaTotal, diskon=0;
        int total;

        do {
            System.out.print("Jumlah tiket (ketik 0 untuk berhenti): ");
            tiket = sc.nextInt();
            
            if (tiket == 0) {
                System.out.println("Program berhenti");
                break;
            }
            if (tiket <0) {
                System.out.println("Jumlah tiket tidak valid, masukkan lagi");
                continue;
                
            }
            if (tiket>0 && tiket<=3) {
                diskon = 0;
            } else if (tiket>3 && tiket<=10) {
                diskon = 0.09;
            } else {
                diskon = 0.17;
            }
            total = harga*tiket;
            diskonHarga = total*diskon;
            hargaTotal = total-diskonHarga;
            System.out.println("Jumlah tiket\t\t\t: "+tiket);
            System.out.println("Diskon\t\t\t\t: Rp. "+diskonHarga);
            System.out.println("Total harga yang harus dibayar \t: Rp. "+hargaTotal);
        } while (true); 
        sc.close();
    }
}