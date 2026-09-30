package Pertemuan3;
import java.util.Scanner;

public class usahaMahasiswa {
    public static void main(String[]args){
        Scanner azka = new Scanner(System.in);
        int totalCetak, hargaTotal;
        int hargaPerlembar = 500;
        int hargaPenjilidan = 5000;

        System.out.println("Masukkan Total Cetak ");
        totalCetak = azka.nextInt();

        hargaTotal = (totalCetak * hargaPerlembar) + hargaPenjilidan;
        
        System.out.println("Jumlah Harga Yang Harus Dibayar " + hargaTotal);
    }
}
