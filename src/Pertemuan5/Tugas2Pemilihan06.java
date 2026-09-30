package Pertemuan5;
import java.util.Scanner;

public class Tugas2Pemilihan06 {
    public static void main(String[] args) {
        Scanner azka = new Scanner(System.in);
        int jumlahSks;
        
        System.out.print("Masukkan Jumlah SKS: ");
        jumlahSks = azka.nextInt();

        if (jumlahSks > 24) {
            System.out.println("Melebihi Batas");
        } else {
            System.out.println("KRS Valid");
        }
    }
}
