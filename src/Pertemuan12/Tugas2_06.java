package Pertemuan12;
import java.util.Scanner;

public class Tugas2_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
        String nama;

        System.out.println("===== DAFTAR MENU KAFE KAMPUS =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1)+ ". " + menu[i] + " : Rp. " + harga[i]);
            
        }
        
        System.out.println("===== PENCARIAN MENU =====");
            int posisi=0;
            String lagi;
            do {
            System.out.print("Masukkan Nama Menu Yang Ingin dicari : ");
            nama= sc.nextLine();
             for (int i = 0; i < menu.length; i++) { 
                if (menu[i].equalsIgnoreCase(nama)) { 
                    posisi = i; 
                    break; 
                } 
            }
            if (posisi != -1) { 
                    System.out.printf("Menu tersedia: %s, harga Rp %,d%n", menu[posisi], harga[posisi]); 
            } else { 
                    System.out.println("Maaf, menu \"" + nama + "\" tidak tersedia."); 
                }
            System.out.print("Cari menu lain? (y/t): "); 
            lagi = sc.nextLine().trim(); 
            } while (lagi.equalsIgnoreCase("y"));
             System.out.println(); 
    System.out.println("========== PEMESANAN =========="); 
    int jumlah; 
        do { 
            System.out.print("Jumlah makanan yang ingin dipesan: "); 
            jumlah = sc.nextInt(); 
            sc.nextLine();  
            if (jumlah <= 0) { 
                System.out.println("Jumlah harus lebih dari 0, silakan ulangi.");
                  } 
        } while (jumlah <= 0); 
 
        String[] pesanan = new String[jumlah];    
        int[] hargaPesanan = new int[jumlah];     
        int total = 0; 
 
        for (int i = 0; i < jumlah; i++) {  
            do { 
                System.out.print("Menu ke-" + (i + 1) +": "); 
                String menuKe = sc.nextLine().trim(); 
 
                posisi = -1; 
                for (int j = 0; j < menu.length; j++) { 
                    if (menu[j].equalsIgnoreCase(menuKe)){ 
                        posisi = j; 
                        break; 
                    } 
                } 
                if (posisi == -1) { 
                    System.out.println("Menu tidak tersedia, silakan masukkan ulang."); 
                } 
            } while (posisi == -1); 
 
            pesanan[i] = menu[posisi]; 
            hargaPesanan[i] = harga[posisi]; 
            total += harga[posisi]; 
        } 
 
         
    System.out.println(); 
    System.out.println("==========  PESANAN =========="); 
        for (int i = 0; i < jumlah; i++) { 
            System.out.printf("%d. %-16s Rp %,8d%n", (i + 1), pesanan[i], hargaPesanan[i]); 
        } 
         
    System.out.printf("%-19s Rp %,8d%n", "TOTAL BIAYA", total);
    sc.close();
    } 
}