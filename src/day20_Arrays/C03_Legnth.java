package day20_Arrays;

import java.util.Arrays;

public class C03_Legnth {
    public static void main(String[] args) {
        //iki sekilde array olusturabiliriz
        int sayilar[]={1,2,3};
        String [] harf=new String[4];
        System.out.println("sayilar array'in uzunlugu : " +sayilar.length);//3
        //string length metodunda parantez var,array'de yok
        System.out.println("harfler array'in uzunlugu:"+harf.length);//4
        System.out.println(Arrays.toString(harf));// [null,null,null,null]
        //harfler array inin son elmentini yazdiralim
        System.out.println(harf[harf.length-1]);
        System.out.println(harf[5]);//ArrayIndexOutOfBoundsException






    }
}
