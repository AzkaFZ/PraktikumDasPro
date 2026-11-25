package Pertemuan12;
import java.util.Scanner;

public class ArrayRataNilai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jmlh = sc.nextInt();
        int[] nilaiMhs = new int[jmlh]; 
        int total = 0, lulus=0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) { 
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": "); 
            nilaiMhs[i] = sc.nextInt(); 
            total += nilaiMhs[i]; 
        }
        rata2 = (double) total / nilaiMhs.length; 
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);

        int tertinggi = nilaiMhs[0]; 
        int terendah = nilaiMhs[0]; 
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i]; 
            if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i]; 
            if (nilaiMhs[i]>70) {
                lulus++;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi); 
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah Mahasiswa Lulus : "+lulus);
        
        if (rata2 >= 85) {
            System.out.println("Predikat Kelas: SANGAT BAIK");
        } else if (rata2 >= 70) {
            System.out.println("Predikat Kelas: BAIK");
        } else {
            System.out.println("Predikat Kelas: PERLU PENDAMPINGAN");
        }
        sc.close(); 
    }
}