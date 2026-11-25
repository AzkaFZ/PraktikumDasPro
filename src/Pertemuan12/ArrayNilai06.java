package Pertemuan12;
import java.util.Scanner;

public class ArrayNilai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];
        int lulus=0, tdkLulus=0;
        for (int i = 0; i < nilaiAkhir.length; i++) { 
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": "); 
            nilaiAkhir[i] = sc.nextInt(); 
        }
        System.out.println("==================================");
        for (int i = 0; i < nilaiAkhir.length; i++) { 
            if (nilaiAkhir[i]>70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
                lulus++;
            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (TIDAK LULUS)");
                tdkLulus++;
            }
            // String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS"; 
            // System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + 
            // status + ")"); 
        }
        System.out.println("==================================");
        System.out.println("Jumlah Mahasiswa Lulus : " + lulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus : " + tdkLulus);
        sc.close();
    }
}