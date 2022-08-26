package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {
        /*
        tek katli array larda arrayi direk yazdiramiyoruz
        cunku array non-primitive data turudur ve her hoh-primitive data direk yazdirilmaya
        bilir
            ancak arrayin icerisindeki elementleri direk yazdirabiliyorduk
            cunku genelde primitive data turu veya String elementler kullaniliyordu

            Multi-dimensional array lerde en dikkat edecegimiz konu ulasmak
            istedigimiz elementin bir array mi yoksa pirimitive data mi oldugudur
         */

        int [][] sayilar= {{1,2,3,4,5},{3,4}};

        /*
        burada sayilar arrayini dusunursek icinde 2 tane inner array var
        sayilar[0]==>[1,2,3,4,5]
        ancak en icerideki elementlere ulasirsak direk yazdirabiliriz
         */
        System.out.println(sayilar[0]);//[I@4dd8dc3
        System.out.println(Arrays.toString(sayilar[0]));//[1, 2, 3, 4, 5]
        System.out.println(sayilar[0][1]);//2
        System.out.println(sayilar[1][0]);//3
        System.out.println(Arrays.toString(sayilar));//[[I@4dd8dc3, [I@6d03e736]
        System.out.println(Arrays.deepToString(sayilar));//[[1, 2, 3, 4, 5], [3, 4]]
        /*
        arrayi iki sekilde declare edebiliyorduk
        1- elemanlari direk yazabiliriz
        int[][]sayilar={{1,2,3,4,5},{3,4}};


        2- outer ve inner array lerin uzunluklarini belirterek olusturabiliriz
        int [][]sayilar=new int[3][5];
        ancak 2. yontemle yaptigimizda inner arraylerin farkli uzunlukta olma ihtimali kalmaz
        bu ornek icin outer array in 3 tane inner array i vardir
        herbir inner arrayin ise 5 er elemani vardir
            eger inner arraymeri farkli uzunluklarda olusturmak istiyorsaniz
            mecburen 1. yontemi kullanmalisiniz

         */

    }

}
