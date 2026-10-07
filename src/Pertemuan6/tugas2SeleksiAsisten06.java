package Pertemuan6;
import java.util.Scanner;

public class tugas2SeleksiAsisten06 {
    public static void main(String[] args) {
        Scanner azka = new Scanner(System.in);
        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean sertifikatKompetensi;
        int nilaiDasPro;
        int nilaiWawancara;

        System.out.print("Apakah Anda Mahasiswa Aktif? (true/false): ");
        mahasiswaAktif = azka.nextBoolean();
        System.out.print("Apakah Anda Sedang Disanksi? (true/false): ");
        sedangDisanksi = azka.nextBoolean();
        

        if (mahasiswaAktif && !sedangDisanksi) {
            System.out.print("\nMasukkan Nilai Dasar Pemrograman Anda: ");
            nilaiDasPro = azka.nextInt();
            System.out.print("Apakah Anda Memiliki Sertifikat Kompetensi? (true/false): ");
            sertifikatKompetensi = azka.nextBoolean();
            
            if (nilaiDasPro >= 81 || sertifikatKompetensi){
                System.out.println("\n---Selamat, Anda Bisa Lanjut ke Tahap Wawancara---");
                System.out.print("\nMasukkan Nilai Wawancara Anda: ");
                nilaiWawancara = azka.nextInt();
                
                if (nilaiWawancara >= 76){
                    System.out.println("\n---Selamat, Anda Diterima Menjadi Asisten Praktikum---");
                } else {
                    System.out.println("Tidak Lolos, Nilai Wawancara Anda Kurang Dari 76");
                }
            } else{
                System.out.println("Tidak Lolos, Nilai Dasar Pemrograman Anda Kurang Dari 81 dan Tidak Punya Sertifikat Kompetensi");
            }
        } else {
            System.out.println("Tidak Lolos, Anda Bukan Mahasiswa Aktif Atau Sedang Mendapatkan Sanksi Akademik");
        }
    }
    
}
