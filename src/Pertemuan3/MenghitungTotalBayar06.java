package Pertemuan3;

import java.util.Scanner;

public class MenghitungTotalBayar06 {
    public static void main(String[] args) {
        Scanner azka = new Scanner(System.in);
        double harga;
        double potongan;
        double jml_bayar;
        double diskon=0.15;

        harga=azka.nextDouble();
        potongan=harga*diskon;
        jml_bayar=harga-potongan;
        System.out.println("Jumlah yang harus anda bayar adalah Rp. " +jml_bayar);
    }
    
}
