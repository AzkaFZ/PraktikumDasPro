package Pertemuan12;
import java.util.Arrays;
import java.util.Scanner;

public class SortNilai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilai = {26, 41, 18, 56, 6, 31}; //B, B+15, B−8, B+30, B−20, B+5  . B = 20 (6 mod 60) = 26
        for (int i = 0; i < nilai.length - 1; i++) { 
            for (int j = 0; j < nilai.length - 1 - i; j++) { 
                if (nilai[j] > nilai[j + 1]) { 
                int temp = nilai[j]; 
                nilai[j] = nilai[j + 1]; 
                nilai[j + 1] = temp; 
              } 
          } 
        } 
System.out.println(Arrays.toString(nilai));
        sc.close();
    }
}