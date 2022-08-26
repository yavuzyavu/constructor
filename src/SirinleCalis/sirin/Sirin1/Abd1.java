package SirinleCalis.sirin.Sirin1;

import java.util.Scanner;

public class Abd1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int sayi=452;
        System.out.println(sayi%10>=5? (sayi -sayi%10 +10) : (sayi- sayi%10));

    }
}
