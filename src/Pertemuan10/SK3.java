package Pertemuan10;
import java.util.Scanner;

public class SK3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlTerjual, jmlProduk=3;
        int totalPerProduk=0, jmlHari=4;
        int ttlPejualan=0;

        for (int i = 0; i < jmlProduk; i++) {
            for (int j = 0; j < jmlHari; j++) {
                System.out.print("Input jumlah terjual: ");
                jmlTerjual = sc.nextInt();
                totalPerProduk += jmlTerjual;
            }
        System.out.println("total Per Produk : "+ totalPerProduk);
        ttlPejualan += totalPerProduk;
        totalPerProduk=0;
        }
        System.out.println("total Penjualan: "+ ttlPejualan);
        sc.close();
    }
}