package Pertemuan7;
import java.util.Scanner;

public class StudiKasus1_06 {
    public static void main(String[] args) {
        Scanner azka = new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah Cup\t\t: ");
        jumlahCup = azka.nextInt();
        System.out.print("Masukkan jumlah Uang Bayar\t: ");
        uangBayar = azka.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000){
            diskon = totalHarga * 10 / 100;
        }else{
        } totalBayar = totalHarga - diskon;

        System.out.println("Total Harga\t\t\t: " + totalHarga);
        System.out.println("Diskon\t\t\t\t: " + diskon);
        System.out.println("Total Bayar\t\t\t: " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian\t\t\t: "+ kembalian);
        } else{
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, Kurang Rp. " + kurang);
        }
    }
    
}


// • hargaPerCup = 15000 + (P mod 6) × 1000 → gantikan Rp18.000 pada flowchart                              hargaPerCup 15000 + 0 x 1000 = 15000
// • Syarat minimal belanja untuk diskon = 80000 + (P mod 5) × 10000 → gantikan Rp100.000 pada flowchart    SyaratMinimal 80000 + 1 x 10000 = 9000
// • Persentase diskon = 5 + (P mod 6) % → gantikan 10% pada flowchart                                      diskon 5 + 0 = 5%
// Struktur logika (urutan langkah pada flowchart) tetap sama, hanya ketiga angka di atas yang diganti
// sesuai P Anda.

// Kedai Kopi Senja menjual Kopi Susu Gula Aren seharga Rp18.000 per cup dan memberikan
// diskon 10% untuk pembelian minimal Rp100.000 [ANGKA CONTOH — WAJIB DIGANTI SESUAI
// PARAMETER UNIK ANDA DI ATAS]. Pemilik kedai membutuhkan program kasir sederhana untuk
// menghitung total bayar dan kembalian. Buatlah program Java berdasarkan flowchart berikut (struktur
// logikanya tetap sama, hanya angkanya yang diganti)