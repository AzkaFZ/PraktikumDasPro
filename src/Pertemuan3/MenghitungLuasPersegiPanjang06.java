package Pertemuan3;
import java.util.Scanner;

public class MenghitungLuasPersegiPanjang06 {
    public static void main(String[] args) {
        Scanner azka = new Scanner(System.in);
        int panjang;
        int lebar;
        int luas;

        panjang=azka.nextInt();
        lebar=azka.nextInt();
        
        luas = panjang * lebar;
        System.out.println("Luas Persegi Adalah " + luas);
    }
    
}
