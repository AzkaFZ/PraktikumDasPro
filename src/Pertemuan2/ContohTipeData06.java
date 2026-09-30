package Pertemuan2;

public class ContohTipeData06 {
    public static void main(String[] args) {
        char GolonganDarah = 'A' ;
        byte Jarak = (byte) 130 ;
        short JumlahPendudukDalamSatuDusun = 1025 ;
        float Suhu = 60.50F ;
        double Berat = 0.5467812345 ;
        long Saldo = 150000000 ;
        int AngkaDesimal = 0x10 ;
        
        System.out.println("Golongan Darah\t\t\t : " + (byte) GolonganDarah) ;
        System.out.println("Jarak\t\t\t\t : " + Jarak) ;
        System.out.println("Jumlah Penduduk Dalam Satu Dusun : " + JumlahPendudukDalamSatuDusun) ;
        System.out.println("Suhu\t\t\t\t : " + Suhu) ;
        System.out.println("Berat\t\t\t\t : " + (float) Berat) ;
        System.out.println("Saldo\t\t\t\t : " + Saldo) ;
        System.out.println("Angka Desimal\t\t\t : " + AngkaDesimal) ;
    
    }
}
