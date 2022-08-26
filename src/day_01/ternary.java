package day_01;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi=scan.nextDouble();

        if (sayi>0) {
            System.out.println(sayi);
        }
            else {
            System.out.println("lutfen bir sayi daha giriniz");
            double sayi2 = scan.nextDouble();
                    System.out.println(sayi*sayi2);
        }

    }
}
