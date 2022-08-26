package day02;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        System.out.println("isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("soyisminizi giriniz");
        String soyisim = scan.nextLine();

        System.out.println("isim soyisim : "+ isim + " " +  soyisim);

    }
}



