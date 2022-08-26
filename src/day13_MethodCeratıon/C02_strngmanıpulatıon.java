package day13_MethodCeratıon;

import java.util.Scanner;

public class C02_strngmanıpulatıon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sifrenizi giriniz");
        String sifre = scan.nextLine();
        int kontrol = 0;
        if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
            kontrol++;
        } else {
            System.out.println("ilk harf buyuk olmali");
        }//without

        if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
            kontrol++;
        } else {
            System.out.println("son harf kucuk olmali");
        }

        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
        } else {
            kontrol++;
        }
        if (sifre.length() >= 8) {
            kontrol++;
        } else {
            System.out.println("sifre 8 karakter olmali");
        }
        if (kontrol == 4) {
            System.out.println("islem basari ile tanimlandi");
        } else {
            System.out.println("tekrar deneyin");
        }


    }
}
