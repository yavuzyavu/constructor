package gurup_calisma.Grp2707;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class metn {
    public static void main(String[] args) {
        /*2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.

         */
        String [] [] kelime= {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};

        List<String> kelime2= new ArrayList<>();

        for (int i = 0; i <kelime.length ; i++) {
            for (int j = 0; j <kelime[i].length ; j++) {
                  kelime2.add(kelime [i][j]);

            }

        }

        Collections.sort(kelime2);
        System.out.println(kelime2);
    }
}
