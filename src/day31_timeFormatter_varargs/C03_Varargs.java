package day31_timeFormatter_varargs;

import static day31_timeFormatter_varargs.C02_Varargs.ToplaYazdir;

public class C03_Varargs {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;

        toplaYazdir(sayi1,sayi2,sayi3,sayi4,sayi5);
        toplaYazdir(sayi1,sayi2,sayi3,sayi4);
        toplaYazdir(sayi1,sayi2,sayi3);
        toplaYazdir(sayi1,sayi2);



    }

    public static void toplaYazdir(int...sayi) {

        int toplam=0;
        int sayiAdedi=sayi.length;

        for (int each:sayi){
            toplam+=each;

        }

        System.out.println("Girilen "+sayiAdedi+" sayinin toplami : "+toplam);
    }
}
