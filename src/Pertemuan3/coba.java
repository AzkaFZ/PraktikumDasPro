package Pertemuan3;
import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner azka=new Scanner(System.in);
        int harga;
        int uangMuka;
        int tenor;
        double cicilanPerbulan, cicilanTanpaBunga, sisaHarga, bungaPerbulan;
        double bunga=0.02;

        System.out.print("Masukkan harga awal ");
        harga=azka.nextInt();
        System.out.print("Masukkan Uang Muka ");
        uangMuka=azka.nextInt();
        System.out.print("masukkan Tenor ");
        tenor=azka.nextInt();
        
        sisaHarga=harga-uangMuka;
        cicilanTanpaBunga=sisaHarga/tenor;
        bungaPerbulan=bunga*cicilanTanpaBunga;
        cicilanPerbulan=cicilanTanpaBunga+bungaPerbulan;

        System.out.println("Cicilan Perbulan Anda Adalah " + cicilanPerbulan);

    }
    
    
}
