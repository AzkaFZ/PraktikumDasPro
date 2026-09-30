package Pertemuan6;
import java.util.Scanner;

public class nestedAksesLab06 {
    public static void main(String[] args) {
        Scanner azka = new Scanner(System.in);
        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Apakah Mahasiswa Aktif? (true/false): ");
        mahasiswaAktif = azka.nextBoolean();
        System.out.print("Apakah Sedang Disanksi? (true/false): ");
        sedangDisanksi = azka.nextBoolean();
        System.out.print("Apakah Punya Izin Dosen? (true/false): ");
        punyaIzinDosen = azka.nextBoolean();
        System.out.print("Apakah Asisten Lab? (true/false): ");
        asistenLab = azka.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi){
            if (punyaIzinDosen || asistenLab) {
                System.out.print("Akses laboratorium diberikan");
            } else{
                System.out.print("Akses ditolak: membutuhkan izin dosen atau asisten lab");
            }
        } else {
            System.out.print("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
    }
    
}
