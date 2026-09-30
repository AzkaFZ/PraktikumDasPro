package Pertemuan5;
import java.util.Scanner;

public class Tugas1Pemilihan06 {
    public static void main(String[] args) {
        Scanner azka = new Scanner(System.in);
        boolean uktLunas;


        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT Sudah Lunas? (true/false): ");
        uktLunas = azka.nextBoolean();
        
        String pesan = uktLunas ? "Pembayaran UKT Terverivikasi \nSilahkan Cetak KRS Dan Minta Tanda Tanngan DPA" : "Registrasi Ditolak. Silahkan Lunasi UKT Terlebih Dahulu";
        
        System.out.println(pesan);
    }
}
