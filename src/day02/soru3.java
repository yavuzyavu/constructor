package day02;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("cemberin yari capini giriniz");
        int r= scan.nextByte();
        System.out.println("cemberin alanini :" + r*r*3.14);
        System.out.println("cemberin cevresi :" + r*2*3.14);

    }
}
