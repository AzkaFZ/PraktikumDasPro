package Pertemuan5;
import java.util.Scanner;

public class TugasParkir06 {
    public static void main(String[] args) {
        Scanner azka = new Scanner(System.in);
        int lamaParkir, totalBiaya;
        int tarifDasar = 2000;
        int tarifTambahan = 1000;

        System.out.print("Lama Parkir: ");
        lamaParkir = azka.nextInt();

        if (lamaParkir <=2){
            System.out.println(tarifDasar);
        } else if (lamaParkir > 2) {
            System.out.println(tarifDasar + ((lamaParkir-2) * tarifTambahan));
        }
    }
    
}
