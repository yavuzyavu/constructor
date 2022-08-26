package pracdes1.Mantoling_abd;

import java.util.Scanner;

public class SoruSifre {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen sifrenizi giriniz");
        String sifre= scan.nextLine();
        char ilkHarf= sifre.charAt(0);

        if (ilkHarf=='A') {
            System.out.println("sifreniz gecerli");}
        else if  (ilkHarf =='z') {
            System.out.println("sifreniz gecerli");
        }else {
            System.out.println("lutfen gecerli bir sifre giriniz");
        }

        }}
