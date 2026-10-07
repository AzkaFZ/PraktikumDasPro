package Pertemuan6;
import java.util.Scanner;

public class tugasLatihan2_06 {
    public static void main(String[] args) {
        Scanner azka = new Scanner(System.in);
        String jenisBuku;
        int jumlahBuku, diskon;

        System.out.print("Jenis Buku: ");
        jenisBuku = azka.nextLine();
        System.out.print("Jumlah Buku: ");
        jumlahBuku = azka.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jumlahBuku > 2) {
                diskon = 11;
            } else {
                diskon = 9;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jumlahBuku > 3){
                diskon = 9;
            } else {
                diskon = 8;
            }
        } else {
            if (jumlahBuku > 3){
                diskon = 5;
            } else {
                diskon = 0;
            }
        }
        System.out.println("Diskon anda adalah: " + diskon + "%");   
    }
}
