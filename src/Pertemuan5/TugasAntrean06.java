package Pertemuan5;
import java.util.Scanner;

public class TugasAntrean06 {
    public static void main(String[] args) {
        Scanner azka = new Scanner(System.in);
        int kodeLayanan;

        System.out.print("Kode Layanan: ");
        kodeLayanan = azka.nextInt();

        switch (kodeLayanan) {
            case 1:
                System.out.println("Selamat Datang Di Layanan Legalisir Ijazah \nPilih Loket A");
                break;
            case 2:
                System.out.println("Selamat Datang Di Layanan Surat Keterangan Kuliah \nPilih Loket B");
                break;
            case 3:
                System.out.println("Selamat Datang Di Layanan Pembayaran UKT \nPilih Loket C");
                break;
            case 4:
                System.out.println("Selamat Datang Di Layanan Pengajuan Cuti Akademik \nnPilih Loket D");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
        }
    }
    
}
