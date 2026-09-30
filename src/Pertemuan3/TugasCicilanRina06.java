package Pertemuan3;
import java.util.Scanner;

public class TugasCicilanRina06 {
    public static void main(String[] args) {
        Scanner azka=new Scanner(System.in);
        double x, y; //x=harga laptop, y=Uang muka
        int z; //z=jumlah berapa bulan
        double sisa, cicilan_perbulan, cicilan_sebelum_bunga, bunga_perbulan;
        double bunga=0.02;

        System.out.println("Masukkan harga laptop ");
        x=azka.nextInt();
        System.out.println("Masukkan uang muka ");
        y=azka.nextInt();
        System.out.println("Masukkan lama cicilan(bulan)");
        z=azka.nextInt();

        sisa=x-y;
        cicilan_sebelum_bunga=sisa/z;
        bunga_perbulan=cicilan_sebelum_bunga*bunga;
        cicilan_perbulan=cicilan_sebelum_bunga+bunga_perbulan;

        System.out.println("jumlah cicilan yang harus dibayar Rina setiap bulan adalah Rp. " + cicilan_perbulan);
        azka.close();
    }
}
