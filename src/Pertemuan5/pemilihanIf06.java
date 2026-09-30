package Pertemuan5;
import java.util.Scanner;

public class pemilihanIf06 {
    public static void main(String[] args) {
        Scanner azka = new Scanner(System.in);
        boolean uktLunas;

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT Sudah Lunas? (true/false): ");
        uktLunas = azka.nextBoolean();
        
        if (uktLunas == true) {
        System.out.println("Pembayaran UKT Terverivikasi");
        System.out.println("Silahkan Cetak KRS Dan Minta Tanda Tanngan DPA");
        } else if (uktLunas == false){
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }

    }
}
