package Pertemuan9;
// 1.  Jumlah mahasiswa (batas perulangan FOR) = 8 + (P mod 5) → gantikan angka 10 pada soal (8 + (6 mod 5) = 9)
// 2. Batas kelulusan pada Pertanyaan no. 4 (modifikasi kode) = 55 + (P mod 11) → gantikan angka 60 pada soal (55 + (6 mod 11) = 61)
import java.util.Scanner;

public class SiakadFor06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 9; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+ i +": ");
            nilai = sc.nextDouble();
            
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        System.out.println("Nilai Tertinggi : "+tertinggi);
        System.out.println("Nilai Terendah : "+ terendah);
        sc.close();
    }
}