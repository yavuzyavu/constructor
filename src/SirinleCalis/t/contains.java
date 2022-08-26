package SirinleCalis.t;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class contains {
    public static void main(String[] args) {
        /*
         yazılan değerin array içerisinde arayan Java Kodu yazınız.
    Array: [1551,1223,1443,1267,1789,1023,2020]
    Aranan Değer:2020
    Beklenen Çıktı:True
   Aranan Değer:2010
    Beklenen Çıktı :False

         */

        Integer arr []= {1551,1223,1443,1267,1789,1023,2020};

        int deger=2010;


        List<Integer> list= new ArrayList<Integer>(Arrays.asList(arr));

        boolean ua=list.contains(deger);
        System.out.println(ua);

    }

       /* for (int i = 0; i <list.size() ; i++) {

            if(list.contains(deger)){

                System.out.println(true);break;
            }else{
                System.out.println(false);break;

        */
            }





