package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_arraydenListOlusturma {
    public static void main(String[] args) {


    /*
    icinde 200 tane 1000 den kucuk pozitiftam sayi olan bir list olusturun
    kullanicidan bir sayi isteyip
    listede var olup olmadigini kullaniciya yazalim
     */
        Random rnd = new Random();
        int sayi = 0;
        List<Integer> sayiList = new ArrayList<>();

        while (sayiList.size() < 200) {
            sayi = rnd.nextInt(1000);
            if (!sayiList.contains(sayi)) {
                sayiList.add(sayi);
            }

        }

        System.out.println(sayiList);

        boolean bildiMi=false;
        int tahminSayisi=1;
        Scanner scan= new Scanner(System.in);

        while (!(bildiMi)){//bildiMi

            System.out.println("lutfen bir sayi tahmininde bulunun");

            sayi=scan.nextInt();
            if(sayiList.contains(sayi)) {
                System.out.println("Tebrikler" + tahminSayisi + "adet tahminde listeden bir sayi bildiniz");
                bildiMi = true;
            }else{
                System.out.println(tahminSayisi+"adet sayi soylediniz ama hicbiri listede yok");
            }   tahminSayisi++;

            }





        }

    }


