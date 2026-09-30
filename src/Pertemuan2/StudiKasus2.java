package Pertemuan2;
import java.util.Scanner;


public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Lebar Tanah ");
        int lebarTanah = input.nextInt();
        System.out.println("Masukkan Panjang Tanah ");
        int panjangTanah = input.nextInt();
        System.out.println("Masukkan Diameter Kolam ");
        int diameterKolam = input.nextInt();
        System.out.println("Masukkan Sisi Kolam ");
        int sisiKolam = input.nextInt();

        int luasTanah = lebarTanah*panjangTanah;
        int jariJariKolam = diameterKolam/2;
        double luasKolam = 3.14*jariJariKolam*jariJariKolam;
        int luasTaman = sisiKolam*sisiKolam;
        double luasTanahYangTidakDigunakan = luasTanah - luasKolam - luasTaman;

        System.out.println("Luas Tanah Yang Tidak Digunakan " +luasTanahYangTidakDigunakan);
    }
    
}
