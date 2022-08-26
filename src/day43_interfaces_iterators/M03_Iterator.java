package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {

        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);//[10,20,30]

        //listeddeki tum elemanlari INDEX KULLANMADAN 3 artirin

        for(Integer each:liste){
            each+=3;
            System.out.print(each+" ");

        }
        System.out.println();
        System.out.println(liste);
        /*
        java index yapisi olmayan collection'lardaki veya degistirmek icin Iterator in
        terface olusturmustur
        Iterator interface oldugundan ondan obje uretmemiz mumkun degildir bunun yerine bize
        Iterator donduren liste.iterrator() methodunu kullaniyoruz
         */
        System.out.println(liste);//[10,20,30]

        Iterator it1 = liste.iterator();
        System.out.println(it1.next());//10
        System.out.println(it1.next());//20
        System.out.println(it1.next());//30
        System.out.println(it1.next());//exception (30'dan sonra eleman kalmadigindan next
                                        //RTE verir


        //while(it1.hasNext()){

        }


    }

