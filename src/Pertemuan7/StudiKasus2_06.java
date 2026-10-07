package Pertemuan7;
import java.util.Scanner;

public class StudiKasus2_06 {
    public static void main(String[] args) {
        Scanner azka = new Scanner(System.in);
        String namaMahasiswa;
        String jenis;
        int jmlDokumen;
        int peringkatJuara;
        int statusPendanaanPKM;
        int pendanaan;

        System.out.print("Nama Mahasiswa : ");
        namaMahasiswa = azka.nextLine();
        System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenis = azka.nextLine();
        

        if (jenis.equalsIgnoreCase("Belmawa") ||
            jenis.equalsIgnoreCase("Bakorma") ||
            jenis.equalsIgnoreCase("Mandiri")) {
                System.out.print("Jumlah Dokumen Yang Diupload : ");
                jmlDokumen = azka.nextInt();
                System.out.print("Peringkat Juara : ");
                peringkatJuara = azka.nextInt();
                if (peringkatJuara >=1 && peringkatJuara <=3) {
                    if (jmlDokumen ==4) {
                        System.out.println("Status : Dana Penghargaan Diberikan");
                    } else {
                        System.out.println("Status : Dokumen Tidak Lengkap (kurang " +(4-jmlDokumen)+ " Dokumen). Dana Tidak Diberikan");
                    }
                }else {
                    System.out.println("Status : Anda bukan peringkat 1, 2, dan 3. Dana Pernghargaan Tidak Diberikan");
                }
        }else if (jenis.equalsIgnoreCase("PKM")) {
            System.out.print("Jumlah Dokumen Yang Diupload : ");
            jmlDokumen = azka.nextInt();
            System.out.print("Apakah Lolos Pendanaan (1=lolos/0=tdk lolos): ");
            pendanaan = azka.nextInt();
            if (pendanaan == 1) {
                if (jmlDokumen ==4){
                    System.out.println("Status : Dana Penghargaan Diberikan");
                } else {
                    System.out.println("Status : Dokumen Tidak Lengkap (kurang" +(4-jmlDokumen)+ ". Dana Tidak Diberikan");
                } 
            
            }else {
                System.out.println("Status : Anda Tidak Lolos Penadanaan. Dana Pernghargaan Tidak Diberikan");
            }
        }else {
            System.out.println("Status : Jenis Kegiatan Tidak Valid");
        }
    }
}
