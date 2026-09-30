package Pertemuan2;

public class ContohVariabel06 {
    public static void main(String[] args) {

        String HobySaya = "Membuat Typografi" ;
        boolean isPandai = true;
        char jeniskelamin = 'L';
        byte UmurSaya = 20;
        double $ipk = 3.24, tinggi = 1.78;

        System.out.println("HobySaya : " + HobySaya);
        System.out.println("Apakah Saya pandai? : " + isPandai);
        System.out.println("Jenis Kelamin : " + jeniskelamin);
        System.out.println("Umur saya saat ini : " + UmurSaya);
        System.out.println(String.format("Saya beripk %.2f, dengan tinggi badan %.2f%n", $ipk, tinggi));
    }
    
}
