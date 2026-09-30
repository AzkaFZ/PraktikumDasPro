package Pertemuan3;
import java.util.Scanner;

public class TugasMahasiswaMencetak06 {
    public static void main(String[] args) {
        Scanner azka=new Scanner(System.in);
        int x;
        int biaya_cetak=500;
        int biaya_penjilidan=5000;

        System.out.println("Masukkan jumlah lembar");
        x=azka.nextInt();
        int total_biaya=(x*biaya_cetak)+biaya_penjilidan;

        System.out.println("total biaya yang harus dibayar mahasiswa adalah " + total_biaya);
    }    
}
