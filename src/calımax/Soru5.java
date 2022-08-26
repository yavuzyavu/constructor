package calımax;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String girilenGün=scan.next().toLowerCase();
        if (girilenGün.equals("pazar") || girilenGün.equals("cumartesi")){
            System.out.println("Girilen gun HAFTASONU");
        }
        if (girilenGün.equals("pazartesi") || girilenGün.equals("sali")
        || girilenGün.equals("carsamba") || girilenGün.equals("persembe")
        || girilenGün.equals("cuma")) {
            System.out.println("Girilen gun HAFTAİCİ");
        }
        if (!(girilenGün.equals("pazartesi") || girilenGün.equals("sali")
                || girilenGün.equals("carsamba") || girilenGün.equals("persembe")
                || girilenGün.equals("cuma")|| girilenGün.equals("cumatesi"))|| girilenGün.equals("pazar")) {
            System.out.println("lutfen gecerli bir gun ismi giriniz");      }


    }

}

