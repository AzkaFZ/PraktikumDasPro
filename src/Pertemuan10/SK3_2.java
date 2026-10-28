package Pertemuan10;
import java.util.Scanner;

public class SK3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlTerjual, jmlProduk=3;
        int totalPerHari=0, jmlHari=4;
        int ttlPejualan=0;

        int n;
        for (int j = 0; j < jmlHari; j++) {
            n=0;
            for (int i = 0; i < jmlProduk; i++) {
                System.out.print("Input jumlah terjual produk "+ ++n +": ");
                jmlTerjual = sc.nextInt();
                totalPerHari += jmlTerjual;
                
            }
        System.out.println("total Per hari : "+ totalPerHari);
        ttlPejualan += totalPerHari;
        totalPerHari=0;
        }
        System.out.println("total Penjualan: "+ ttlPejualan);
        sc.close();
    }
}