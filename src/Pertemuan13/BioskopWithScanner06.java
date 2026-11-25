package Pertemuan13;
import java.util.Scanner;

public class BioskopWithScanner06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, pilihan;
        String[][] penonton = new String[4][2];
        int menu = 0;
        
        while (menu!=3) {
            System.out.println("=========== Menu ===========");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.println("=============================");
            System.out.print("Pilih Menu : ");
            menu = sc.nextInt();
            sc.nextLine();
            if (menu==1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                while (true) {
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    
                    if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[baris - 1].length) {
                        System.out.println("Baris/kolom tidak tersedia");
                    }  else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi, pilih yang lain!");
                    } else {
                        break;
                    } 
                }
                penonton[baris - 1][kolom - 1] = nama;

            } else if (menu==2) {
                for (int i = 0; i < penonton.length; i++) {
                    
                }
            } else {
                
            }
           
        }
        sc.close();
    }
}