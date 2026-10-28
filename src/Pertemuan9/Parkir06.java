package Pertemuan9;
// Tarif parkir mobil = 2500 + (6 mod 6) × 250 = 2500 per jam → gantikan Rp3.000 pada soal
// Tarif parkir motor = 1500 + (6 mod 6) × 250 = 1500 per jam (gunakan nilai (P mod 6) yang SAMA
// dengan tarif mobil) → gantikan Rp2.000 pada soa
import java.util.Scanner;

public class Parkir06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total=0;


        do {
            System.out.print("Jenis (1 = mobil, 2 = motor): ");
            jenis = sc.nextInt();
            
            if (jenis == 0) {
                System.out.println("Program berhenti");
                break;
            }
            if (jenis !=1 && jenis !=2) {
                System.out.println("Jenis tidak valid, coba lagi!!!");
                continue;
            }
            if ((jenis==1)||(jenis==2)) {
                System.out.print("Masukkan durasi: ");
                durasi = sc.nextInt();
                if (jenis==1) {
                    total += durasi*2500;
                } else {
                    total += durasi*1500;
                }
            }
        } while (jenis !=0);
        System.out.println("Total bayar: Rp. "+ total);
        sc.close();
    }
}