package Pertemuan6;
import java.util.Scanner;

public class nestedUjianSkripsi06 {
    public static void main(String[] args) {
        Scanner azka = new Scanner(System.in);
        String pesan;

        System.out.print("Apakah Mahasiswa Bebas Kompen? (ya/tidak): ");
        String bebasKompen = azka.nextLine().trim();
        System.out.print("Masukkan log pembimbing 1: ");
        int bimbinganP1 = azka.nextInt();
        System.out.print("Masukkan log pembimbing 2: ");
        int bimbinganP2 = azka.nextInt();

        if(bebasKompen.equalsIgnoreCase("ya")){
            if(bimbinganP1 >=7 && bimbinganP2 >=3){
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar Ujian Skripsi";
                }else if(bimbinganP1 <7 && bimbinganP2 <3){
                    pesan = "Gagal! Log bimbingan P1 kurang dari 7 kali dan P2 kurang dari 3 kali";
                }else if(bimbinganP1 <7){
                    pesan = "Gagal! Log bimbingan P1 belum mencapai 7 kali";
                }else{
                    pesan = "Gagal! Log bimbingan P2 belum mencapai 3 kali";
                }
            } else{
                pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
            }
            System.out.println(pesan);
        }
    }
    

