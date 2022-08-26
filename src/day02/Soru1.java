package day02;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println(" enter'a bas bir sayi yaz" );
        int sayi1= scan.nextInt();
        System.out.println("ikinci sayıyı yazınız");
        int sayi2= scan.nextInt();
        System.out.println(sayi1*sayi2);
        System.out.println(sayi1+sayi2);
        System.out.println("sayilarin cikarimi:" +(sayi1-sayi2));




        }
}
