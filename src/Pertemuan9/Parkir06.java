package Pertemuan9;
import java.util.Scanner;

public class Parkir06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total=0;


        do {
            System.out.print("Jenis: ");
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
                    total += durasi*3000;
                } else {
                    total += durasi*2000;
                }
            }
        } while (jenis !=0);
        System.out.println("Total bayar: Rp. "+ total);
        sc.close();
    }
}