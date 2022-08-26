package day02;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen ilk sayıyı giriniz" );
        double sayi = scan.nextDouble();
        System.out.println("Lütfen ikinci sayiyi giriniz");
        double sayi1 = scan.nextDouble();
        System.out.println("girilen sayilarin çarpimi:" +sayi*sayi1);
    }}
