package Pertemuan12;
import java.util.Scanner;

public class SearchNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Elemen : ");
        int jmlh = sc.nextInt();
        int[] nilai = new int[jmlh];//{78, 65, 90, 55, 88, 72}; 

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan Nilai Indeks Ke-"+i+" : ");
            nilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan Nilai Yang Dicari : ");
        int key = sc.nextInt();
        // int key =55 ;
        boolean ditemukan = false; 
        for (int i = 0; i < nilai.length; i++) { 
            if (nilai[i] == key) { 
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i); 
                ditemukan = true; 
                break;
        } 
        } 
        if (!ditemukan) { 
            System.out.println("Nilai " + key + " tidak ditemukan dalam "+jmlh+" elemen array."); 
        }
        sc.close(); 
    }
}
