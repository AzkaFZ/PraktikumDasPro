package Pertemuan6;
import java.util.Scanner;

public class operatorLogikaWifi06 {
    public static void main(String[] args) {
        Scanner azka = new Scanner(System.in);
        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = azka.nextBoolean();
        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen = azka.nextBoolean();
        System.out.print("Apakah akun diblokir? (true/false): ");
        akunDiblokir = azka.nextBoolean();

        if((mahasiswa || dosen)&& akunDiblokir){
            System.out.print("Akses Wifi Diberikan");
            }else{
                System.out.print("Akses Wifi Ditolak");
            }
    }
    
}
