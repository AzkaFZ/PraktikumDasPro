package Pertemuan12;
import java.util.Scanner;

public class Tugas1_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Siswa: ");
        int jmlhMhs = sc.nextInt();
        int totalNilai =0;
        int[] nilaiMhs = new int[jmlhMhs];
        for (int i = 0; i < jmlhMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] <0 || nilaiMhs[i] >100) {
                System.out.println("Nilai Tidak Valid. Silahkan Coba Lagi!");
                i--;
                continue;
                
            }
            totalNilai += nilaiMhs[i];
            
        }
        double rata2 = totalNilai/jmlhMhs;
        System.out.println("Rata-rata Nilai : "+ rata2);
        
        for (int i = 0; i <jmlhMhs ; i++) { 
            String status = (nilaiMhs[i] > 50) ? "LULUS" : "TIDAK LULUS"; 
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i] + " (" + 
            status + ")"); 
        }
        sc.close(); 
    }
}