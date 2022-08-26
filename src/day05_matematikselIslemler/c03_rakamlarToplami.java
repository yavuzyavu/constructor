package day05_matematikselIslemler;

import java.util.Scanner;

public class c03_rakamlarToplami {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 4 basamakli pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt();
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int ilkGirilenSayi = sayi;
        
        birlerBasamagi=sayi % 10;
        rakamlarToplami += birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        rakamlarToplami += birlerBasamagi;
        sayi/=10;

        birlerBasamagi = sayi%10;
        rakamlarToplami +=birlerBasamagi;
        sayi/=10;

        birlerBasamagi =sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        System.out.println(ilkGirilenSayi + " girilen sayinin rakamlari toplami : " + rakamlarToplami );















    }
}
