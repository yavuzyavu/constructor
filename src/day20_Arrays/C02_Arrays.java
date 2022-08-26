package day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        int sayilar[] =new int[3];
        System.out.println(sayilar);//[I@4dd8dc3    //non-primitive data turundeki datalari her zaman
        // direkt yazdirmaya biliriz.  Array i yazdirmak icin Arrays class indan yardim isteriz.
        System.out.println(Arrays.toString(sayilar));//[0,0,0// ]

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;
        System.out.println(sayilar);//[I@4dd8dc3
        System.out.println(Arrays.toString(sayilar));//[5,3,10]

        String sinifList[]={"ali","can","hasan"};
        System.out.println(Arrays.toString(sinifList));//[ali, can, hasan]

        sinifList[1]="omer";

        System.out.println(Arrays.toString(sinifList));//[ali,omer,hasan]
        System.out.println(sinifList[1]); //[omer]
        System.out.println(sinifList[0]); //[ali]





    }}