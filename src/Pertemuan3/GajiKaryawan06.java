package Pertemuan3;
import java.util.Scanner;

public class GajiKaryawan06 {
    public static void main(String[] args) {
        Scanner azka=new Scanner(System.in);
        int gajiPokok;
        double bonus, totGaji;
        double tunjTranp=600000;
        double tunjMkn=400000;

        gajiPokok = azka.nextInt();
        bonus= 0.05*gajiPokok;
        totGaji=gajiPokok+tunjTranp+tunjMkn+bonus-(0.01*gajiPokok);
    
        System.out.println("Bonus Bulanan anda adalah Rp. " + bonus);
        System.out.println("Gaji yang diterima adalah Rp. "+ (int) totGaji);
    }
}
