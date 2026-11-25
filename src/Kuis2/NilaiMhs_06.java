package Kuis2;
import java.util.Scanner;

public class NilaiMhs_06 {
    public static void main(String[] args) {
        Scanner azka = new Scanner(System.in);
        String nama, lnjt;
        int kuis, uts, uas;
        double rataRata, nilaiAkhir, nilaiTugas=0, tugas=0;
        int i=0;
        int j=1;
        System.out.print("Nama Mahasiswa : ");
        nama = azka.nextLine();

        do {
            do {
                
                System.out.print("Nilai Kuis : ");
                kuis = azka.nextInt();
                System.out.print("Nilai UTS : ");
                uts = azka.nextInt();
                System.out.print("Nilai UAS : ");
                uas = azka.nextInt();
                while (j < 3) {
                    System.out.print("Nilai Tugas "+ j + " : ");
                    tugas = azka.nextInt();
                    if (tugas < 0 || tugas > 100) {
                        System.out.println("Nilai Tidak Valid, Ulangi!");
                        continue;  
                    }
                    nilaiTugas += tugas;
                    tugas=0;
                j++;
                }
            
                rataRata = (nilaiTugas/2);
                nilaiAkhir = (kuis*25/100)+(uts*25/100)+(uas*25/100)+(rataRata*25/100); 
                System.out.println("Rata-rata tugas : "+ rataRata);
                System.out.println("Nilai Akhir : "+ nilaiAkhir);
            } while (false);
            System.out.print("Apakah ingin menambah siswa? (Y/T)");
            lnjt = azka.nextLine();
            azka.nextLine();
            i++;
        } while (lnjt.equalsIgnoreCase("y"));
        System.out.println("Jumlah Siswa : "+ i);
        
    }
}