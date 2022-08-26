package day_2806;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("boyunuzu cm olarak giriniz");
        double boy=scan.nextDouble()/100;
        System.out.println("kilonuzu kg olarak giriniz");
        double kilo= scan.nextDouble();
        double dmi=kilo/(boy*boy);

        boolean b = dmi <= 25;
        if (dmi<=20) {
            System.out.println("dmi indexsiniz" + dmi + "oldukca zayıfsınız");
        }

}}
