package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {

    /*
    1) lambda (functional programming) Java 8 ile kullanilmaya baslamistir.
    2) Functional Programming'de ne yapilacak (What to do) uzerine yogunlasılır. Structured Programming "nasil
     yapilacak (How to do) uzerine yogunlasir
     3) functional programming Arrays ve Collections ile kullanilir.
     4) "entrySet() methodu ile Map, Set'e donusturulerek Functional Programming'de kullanilabilir.
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

        listElemanlariniYazdirStructured(liste);
        System.out.println();
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirStructured(liste);
        System.out.println("Functional");
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElamanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKarelerininToplami(liste);
        tekrarsizCiftElemanlarinKupununCarpimi(liste);
        getMaxEleman01(liste);
        getMaxEleman02(liste);
        getMinEleman(liste);
        getYedidenBuyukCiftMin(liste);
        getYedidenBuyukCiftMin1(liste);
        getYedidenBuyukCiftMin2(liste);
        getTersSiralamaylaTekrarsizElemanlarinYarisi(liste);



    }
    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void listElemanlariniYazdirStructured(List<Integer> list){

        for(Integer w : list){

            System.out.print(w+" ");

        }
    }

    //1)Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void listElemanlariniYazdirFunctional(List<Integer> list){
        list.stream().forEach(m-> System.out.print(m+" "));// stream methodu collection dan elementleri akisa dahil etmek icin ve methodlara ulasmak icin
                                                            //kullanilir


    }

    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
        public static void ciftElemanlariYazdirStructured(List<Integer>list){

        for(Integer w:list){

            if (w%2==0){
                System.out.print(w+" ");
            }
        }
        }

    //2)cuft sayi olan çift list elamanlarini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void ciftElemanlariYazdirFunctional(List<Integer> list){

        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));

    }

    //3) Ardışık tek list elementlerinin karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYazdir(List<Integer> list){

        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));
       //elemanlarin degerleri degisecekse map methodu kullanilir


    }

///4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekrarsizTekElamanlarinKupunuYazdir(List<Integer> list){

    list.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));

    }


    //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKarelerininToplami(List<Integer> list){

       Integer toplam= list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println(toplam);


    }


    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKupununCarpimi(List<Integer> list){

       Integer carpim= list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
        System.out.println(carpim);

    }


    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    //1. yol

    public static void getMaxEleman01(List<Integer> list){

        Integer max=list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u ? t : u);//list.get(0)
        System.out.println(max);
        //System.out.println("143. satir; "+list.get(0));


    }

    //2. yol:
    public static void getMaxEleman02(List<Integer> list){


        Integer max= list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
        System.out.println("max = " + max);
    }
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)

    public static void getMinEleman(List<Integer> list){

        Integer min=list.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println("minE = " +min);
    }

   //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
   // 1. Yol:

    public static void getYedidenBuyukCiftMin(List<Integer> list){


        Integer min=list.stream().distinct().filter(t->t%2==0 && t>7).reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t : u);
        System.out.println("min = " + min);

    }

    // 2.Yol:

    public static void getYedidenBuyukCiftMin1(List<Integer> list){

       Integer min= list.stream().distinct().filter(t->t%2==0).filter(t->t>7).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println("min = " + min);

    }
        //3.yol:

    public static void getYedidenBuyukCiftMin2(List<Integer> list){


        Integer min= list.stream().filter(t-> t%2==0).filter(t->t>7).sorted().findFirst().get();
        System.out.println("min = " + min);
    }


    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public static void getTersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list){

        List<Double> sonuc= list.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("sonuc = " + sonuc);

    }












}