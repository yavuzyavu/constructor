package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        List<String> urunler= new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println(urunler.indexOf("Ikram"));//1
        //indexOf methodu bize bilgi doduren bir method dur
        //listemizi degistirmez

        System.out.println(urunler.lastIndexOf("Ikram"));//1
        /*
        indexOf method u urunu aramaya 0. indexten
        lastIndexOf methodu ise aramaya son index den baslar

        arama bitip, urun bulundugunda ikiside bulunan urunun index ini verir.
         */
        urunler.add("Ikram");
        System.out.println(urunler);
        System.out.println(urunler.indexOf("Ikram"));//1
        System.out.println(urunler.lastIndexOf("Ikram"));//4


        System.out.println(urunler.indexOf("Hobby")); //-1
        System.out.println(urunler.lastIndexOf("Hobby"));//-1

    }
}
