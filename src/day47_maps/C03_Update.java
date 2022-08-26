package day47_maps;

import day46_maps.ReusableMethods;

import java.util.*;

public class C03_Update {
    public static void main(String[] args) {

        /*
        map.contains(key) ==> verdigimiz key in map te olup olmadigini boolean olarak
        doner
        map.contains(value)==> bir butun olarak map'te olup olmadigini doner

        ONEMLİ NOT : map.

        map.get(key) ==> verilen key'e ait degeri dondurur
        */

        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();

        System.out.println(sinifListMap);

        System.out.println(sinifListMap.containsKey(104));//true
        System.out.println(sinifListMap.containsKey(114));//false

        System.out.println(sinifListMap.containsValue("Ali, Can, JDev"));//true

        System.out.println(sinifListMap.containsValue("JDev"));//false

        //Verilen map'te JDev degerlerini JavaDeveloper olarak degistirelim
        // Map'lerde replace tum value yi degistirmek istersek kullanilabilir. kismi
        // degisikliklerde kullanamayiz

        ReusableMethods.tumValueSiraliYazdir(sinifListMap);

        //Map'i guncelleme yapmak icin key, yenideger'i map e eklemeliyiz
        //ornegin key 101 icin value Ali, Can, JDev
        //guncelleme icin sinifListMap.put

        //bunu yapabilmek icin herbir key'e ve ona ait value'ye ihtiyacim var

        Set<Integer> keySeti= sinifListMap.keySet();

        String eachValue;
        for (Integer each:keySeti){

            eachValue=sinifListMap.get(each);
            eachValue= eachValue.replace("JDev","JavaDeveloper");
            sinifListMap.put(each,eachValue);
            /*
            biz key lerin tamamini aldik herbir key in value sini getirdik
            value uzerinde degisikligi yapip yeni halini put(key,yeniDeger) ile map'e koyduk
             */



        }

        System.out.println(sinifListMap);
    }
}




