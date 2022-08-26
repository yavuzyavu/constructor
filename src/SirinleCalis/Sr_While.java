package SirinleCalis;

import java.util.Scanner;

public class Sr_While {
    public static void main(String[] args) {
        //TASK :
        // kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
        // kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
        //
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bolen ve bolunen seklinde iki sayi giriniz");
        int bolunen=scan.nextInt();
        int bolen=scan.nextInt();
        int islemSayisi=0;


         bolumuHesapla(bolunen,bolen,islemSayisi);



    }

    private static void bolumuHesapla(int bolunen, int bolen, int islemSayisi) {
       while (bolen<=bolunen){
        bolen+=bolen;
        islemSayisi++;

        }


        //|| [veya]

        while (bolunen>=bolen) {
           bolunen -= bolen;
           islemSayisi++;}


        System.out.println("sonuc:"+islemSayisi);
}}
