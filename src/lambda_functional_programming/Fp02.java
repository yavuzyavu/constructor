package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {

    /*
   1)  t-> "logic" , (t,u) -> "Logic"
    bu yapiya "Lambda Expession"
   2) Functional Programing kapsaminda "Lambda Expession" kullanilabilir ama onelrilmez.
   "Lambda Expession" yerine "Method Reference" tercih edilir.
   3) "Method Reference" kullanimi "Class Name :: Method Name"

   Ayni zamanda kendi class'larinizi da kullanabilirsiniz.
   Ornegin bir Animal class'iniz varve bu class "eat()" methoduna sahip ==> "Animal :: eat"

    */

    public static void main(String[] args) {

        List<Integer> liste= new ArrayList<>();

        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElamanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);
        tekrarsizCiftElemanlarinKareToplami1(liste);
        tekrarsizCiftElemanlarinKareToplami2(liste);
        tekrarsizCiftElemanlarinKupCarpimi(liste);
        getMaxEleman(liste);
        yedidenBuyukCiftMin(liste);
        tersSiralamaylaTekrarsizElemanlarinYarisi(liste);





    }
    //1) Ardışık list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional ve method reference)
    public static void listElemanlariniYazdirFunctional(List<Integer> list){

        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);
    }


    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {

        list.stream().filter(Utils::ciftElemaniSec).forEach(Utils::ayniSatirdaBosluklaYazdir);

}
//3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYazdir(List<Integer> list){

        list.stream().filter(Utils::tekElemaniSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //4) Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekrarsizTekElamanlarinKupunuYazdir(List<Integer> list){

        list.stream().distinct().filter(Utils::tekElemaniSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.
    //1.Yol :

    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list){

        Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(0,Math::addExact);
        System.out.println(toplam);
    }
    //2.Yol :

    public static void tekrarsizCiftElemanlarinKareToplami1(List<Integer> list){

        Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(Math::addExact).get();
        System.out.println(toplam);
    }

    //3.Yol :

    public static void tekrarsizCiftElemanlarinKareToplami2(List<Integer> list){

        Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesiniAl).reduce(0,Integer ::sum);
        System.out.println(toplam);
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKupCarpimi(List<Integer> list){

        Integer carpim= list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::kupunuAl).reduce(1,Math::multiplyExact);
        System.out.println(carpim);

    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

    public static void getMaxEleman(List<Integer> list){

        Integer max= list.stream().distinct().reduce(Math::max).get();
        System.out.println("maxxx: "+max);

    }

    //8) List elemanlari arasindan en kucuk degeri bulan bir method olusturun.

    public static void getMinEleman(List<Integer> list){

        Integer min=list.stream().distinct().reduce(Math::min).get();
        System.out.println("min: "+min);
    }

    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.

    public static void yedidenBuyukCiftMin(List<Integer> list){

        Integer min=list.stream().distinct().filter(t->t>7).filter(Utils::ciftElemaniSec).reduce(Math::min).get();
        System.out.println("min = " + min);
    }

     //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public static void tersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list) {

        List<Double> sonuc=list.stream()//gerekli methodlari kullanmamizi saglar
                .distinct()//tekrarli olanlari almaz
                .filter(t->t>5)//Kosula gore filitreleme yapar
                .map(Utils::yarisiniAl)//Her bir elemanın değerini değiştirmeye yarar
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(sonuc);
    }







}
