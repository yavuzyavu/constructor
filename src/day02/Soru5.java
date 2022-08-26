package day02;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        System.out.println("isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("soyisminizi giriniz");
        String soyisim = scan.nextLine();
        System.out.println("Isminiz:"+isim);
        System.out.println("SoyIsminiz:"+soyisim);
        System.out.println("kursa katiliminiz saglanmistir");


    }
}
