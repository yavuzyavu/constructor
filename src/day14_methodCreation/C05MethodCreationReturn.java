package day14_methodCreation;

import java.util.Scanner;

public class C05MethodCreationReturn {
    public static void main(String[] args) {
        String sehir=sehirAl();
        String tarih=tarihAl();
        System.out.println("Girdiginiz sehir:"+sehir);
        System.out.println("Girdiginiz tarih:" +tarih);

    }

    public static String tarihAl() {
        String tarih="";
        Scanner scan=new Scanner(System.in);
        System.out.println("yil giriniz");
        int yil=scan.nextInt();
        if (yil>900 && yil<2100){
             tarih = yil + "-";}
        else{
            System.out.println("yil icin gecerli bir tarih giriniz (1900-2100)");
        }
        System.out.println("kacinci ay oldugunu tam sayi olarak giriniz");
        int ay=scan.nextInt();
        if (ay<=0||ay>12){
            System.out.println("Ay no 1-12 arasinda olmalidir");
        }
        else if (ay<10){
            tarih=tarih+"0"+ay+"-";}
        else { tarih=tarih+ay+"-";}
        System.out.println("lutfen ayin kacinci gunu oldugunu tam sayi olarak giriniz");
        int gun=scan.nextInt();
        if (gun<=0 ||gun>31){
            System.out.println("gun olarak 1-31 arasinda bir tamsayi giriniz");}
        else if (gun < 10) {
       tarih= tarih+"0"+gun;}
        else {tarih=tarih+gun;}

        return tarih;
        }


    public static String sehirAl() {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen sehir adi giriniz");
        String sehirAdi=scan.next().toUpperCase();
        return sehirAdi;
    }
}
