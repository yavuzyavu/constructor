package day_01;

import java.util.Scanner;

public class C01_mutlakDegerx {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi=scan.nextDouble();

        System.out.println(sayi>0 ? sayi :( sayi*-1) );


    }
}
