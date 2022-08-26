package day48_maps_TheEnd;

import day46_maps.ReusableMethods;

import java.util.Map;

public class C02_MapMethodlari {
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();

        ReusableMethods.entryYazdir(sinifListMap);


    }
}
