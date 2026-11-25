package Pertemuan12;
import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] OldArray = {1, 3, 6, 7, 9};
        int[] NewArray = new int [5];

        for (int i = 0; i < NewArray.length; i++) {
            NewArray[i] = OldArray[i+2];
            System.out.println(NewArray[i]);
        }
        sc.close();
    }
}