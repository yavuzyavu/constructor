package day17_NestedForLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String sifre="";
        boolean sifreBasariliMi=false;
        int kontrol=0;
        while(!sifreBasariliMi){
            System.out.println("lutfen bir sifre giriniz");
            sifre=scan.nextLine();
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

            if (kontrol == 4) {// tum kontrolleri gecmis demektir

                    System.out.println("islem basari ile tanimlandi");
            }else{
                kontrol=0;
            }
            }

        }

    }

