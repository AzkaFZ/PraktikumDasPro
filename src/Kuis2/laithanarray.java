package Kuis2;
import java.util.Scanner;

public class laithanarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tugas[]={50,70,90.5,95.5};
        String namaMhs[]={"azka", "fairuz", "zayyan", "hehe"};
        double maks=tugas[0];
        String namaMaks=namaMhs[0];
        double total=0;
        for (int i = 0; i < namaMhs.length; i++) {
            System.out.println(namaMhs[i]+" : "+tugas[i]);
            total+=tugas[i];
            if (tugas[i]>maks) {
                maks = tugas[i];
                namaMaks = namaMhs[i];
            }
        }
        double rata=total/tugas.length;
        System.out.println("Rata : "+ rata);
        System.out.println("Nilai Maks : "+namaMaks+" = "+maks);
        sc.close();
    }
}