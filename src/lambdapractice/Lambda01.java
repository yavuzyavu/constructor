package lambdapractice;

import java.util.*;
import java.util.stream.Stream;

public class Lambda01 {

    private static java.util.ArrayList<String> ArrayList;
    static ArrayList<String> name = new ArrayList<>(Arrays.asList("ahmet", "mehmet", "halit", "caner"));

    static List<Integer> number = new ArrayList<>(Arrays.asList(25, 65, -56, 98, 56, 90, 78, 99));


    //en buyuk elemani bulun
    public static void maxElemanBul(List<Integer> sayi) {

        Optional<Integer> maxSayi = sayi.stream().reduce(Math::max);
        System.out.println("maxSayi: " + maxSayi);

        System.out.println(sayi.stream().reduce(Integer::max));


    }

    //listteki tum elemanlarin toplamini yazdir
    public static void elemanlariTopla(List<Integer> sayilar) {
        System.out.println(sayilar.stream().reduce(0, (a, b) -> a + b));
        System.out.println(sayilar.stream().reduce(Integer::sum).get());
    }

    //listeki cift elemanlarin carpimini yazdir
    public static void ciftElemanlariCarp(List<Integer> sayilar) {
        System.out.println(sayilar.stream().filter(a -> a % 2 == 0).reduce(1, (a, b) -> a * b));
        System.out.println(sayilar.stream().filter(Methodlarim::ciftElemaniBul).reduce(Math::multiplyExact).get());
    }

    //tek sayilarin karesini buyukten kucuge sirala
    //
    public static void sonHarfeGoreTersSira(List<String> yemek) {

        yemek.stream().sorted(Comparator//siralma aksiyonuna girildi
                .comparing(t -> t.toString()//her bir eleman stringe cevrildi, elemanin kendisi alindi
                        .charAt(t.toString().length() - 1))//son karakter i charAt ile alindi
                .reversed()).//son harfine gore tersine siralandi
                forEach(t-> System.out.println(t));
    }
    //List elemanlarinin karakter sayisini 7 ve 7den  az olma durumunu kontrol ediniz

    public static void karakterSayiYedidenBuyuk(List<String> yemek) {
        //ilkel yontem
        boolean kontrol = yemek.stream().allMatch(t -> t.length() <= 7);//true gelirse if calisacak
        if (kontrol) {
            System.out.println("list elemanlari 7 ve daha az harften olusmus");
        } else System.out.println("bazi elemanlar 7 den buyuk");

        //modern yontem
        System.out.println(yemek.stream().allMatch(t -> t.length() <= 7) ? "list elemanlari 7 ve daha az harften olusmus" :
                "bazi elemanlar 7 den buyuk");

    }

    //length en uzun olani al

    public static void karakterEnfazla(List<String> yemek){
        Stream<String> sonIsim=//limit kullandigimiz icin bu sonucu  Stream methodu ile sonIsme atadik
                yemek.stream().//akisa alindi
                sorted(Comparator.//siraladık
                        comparing(t->t.toString().length())//siralamayi length gore yaptik
                        .reversed()).//tersine cevirdik yani karekter sayisi en cok olan en basa geldi
                limit(1);//limit ile ilk elemani aldik listeyi ilk eleman ile siraladik
        System.out.println//sonIsim objesi data turu Stream oldugu icin arraya cevirdik
                (Arrays.toString//array olanlari Stringe donusturup yazdirmamizi saglar
                        (sonIsim.toArray()));//Stream tipi arraya cevrildi
    }

}
