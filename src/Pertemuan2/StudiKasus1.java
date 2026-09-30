package Pertemuan2;
import java.util.Scanner;

public class StudiKasus1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Masukkan Gaji Pokok ");
        int gajiPokok = input.nextInt();
         System.out.println("Masukkan Tunjangan ");
        int tunjangan = input.nextInt();
         System.out.println("Masukkan Jumlah Anak ");
        int jumlahAnak = input.nextInt();
        double potongan = 0.10;
        
        int totalTunjangan = tunjangan*jumlahAnak;
        double potonganPensiun = potongan*gajiPokok;
        double gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

        System.out.println("Gaji Bersih " +gajiBersih);

    }
    
}
