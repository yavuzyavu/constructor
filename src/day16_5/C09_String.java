package day16_5;

import java.util.Scanner;

public class C09_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi ve soyisminizi giriniz: \nisim");
        String isim=scan.nextLine();
        System.out.println("soyisim");
        String soyisim=scan.nextLine();

        if (isim.length()>soyisim.length()){
            System.out.println("isiminiz soyisminizden uzundur");
        }
        else if(isim.length()==soyisim.length()){
            System.out.println("isiminiz soyisminize esit");
        }
            else{
            System.out.println("isminiz soyisminizden kisadir");
        }
        }

    }

