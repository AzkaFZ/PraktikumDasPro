package Pertemuan6;
import java.util.Scanner;

public class nestedUjianSkripsi06 {
    public static void main(String[] args) {
        Scanner azka = new Scanner(System.in);
        String pesan;
        int bimbinganP1, bimbinganP2;

        System.out.print("Apakah Mahasiswa Bebas Kompen? (ya/tidak): ");
        String bebasKompen = azka.nextLine();
        System.out.print("Masukkan log pembimbing 1: ");
        bimbinganP1 = azka.nextInt();
        System.out.print("Masukkan log pembimbing 2: ");
        bimbinganP2 = azka.nextInt();

        if(bebasKompen.equalsIgnoreCase("ya")){
            if(bimbinganP1 >=8 && bimbinganP2 >=4){
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar Ujian Skripsi";
                }else if(bimbinganP1 <8 && bimbinganP2 <4){
                    pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
                }else if(bimbinganP1 <8){
                    pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
                }else{
                    pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
                }
            } else{
                pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
            }
            System.out.println(pesan);
        }
    }
    

