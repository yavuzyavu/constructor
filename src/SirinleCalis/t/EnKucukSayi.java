package SirinleCalis.t;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnKucukSayi {
    public static void main(String[] args) {
        /* Üç sayı arasındaki en küçük sayıyı bulmak için bir Java METHOD yazın.
            ​
    Test data:
            12,24,34
            ​
    Beklenen Çıktı:
            12}
    */
    Integer [] sayilar= {12, 34, 45, 56,0,-5};
       int min= Integer.MAX_VALUE;

        for (int i = 0; i <sayilar.length ; i++) {

            if(sayilar[i]<min){
                min=sayilar[i];
                //sayilar[i]=min; min sayilara atadigimiz icin surekli min i verir
            }


        }
        //System.out.println(Arrays.toString(sayilar));
        System.out.println(min);
    }

    }



